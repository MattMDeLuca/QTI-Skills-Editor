package com.qti.program;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.imsglobal.xsd.imscp_v1p1.ManifestType;
import org.imsglobal.xsd.imsqti_v2p1.AssessmentItemType;

import javafx.collections.ObservableList;

/** This is the main class for handling the unzipping, serialization, and data retrieval for QTI
 * packages.
 * @author Matt DeLuca
 *
 */
public class QTIHandler {
	
	private static ArrayList<AssessmentItemType> qtiQuestionsArrayList; //store the list of Assessment Item objects to pass to the UI.
	
	private static Path qtiWorkingDirectory; //store the directory of the unzip QTI files to make it easy to access among static methods.
	
	private static ManifestType qtiManifest; //store the QTI manifest element in the class to make access easy among methods.
	
	/**
	 * This method provides an easy way for the UI to call for the table to be updated from the initial load or from when the skill codes are updated.
	 * It takes a zip file as an argument.
	 * 
	 * @param qtiPackage
	 * @return
	 */
	public static ArrayList<AssessmentItemType> populateQTIQuestions(File qtiPackage) {
		
		unzipQtiPackage(qtiPackage);
		
		retrieveQtiManifestData();
		
		retrieveQuestionContent();
		
		return qtiQuestionsArrayList;
	}

	/**
	 * This method unzips the QTI package into a folder on the OS. It takes a
	 * zip file as an argument.
	 * @param qtiPackageFile
	 */
	private static void unzipQtiPackage(File qtiPackageFile) { 
		
		String currentWorkingDir = qtiPackageFile.getPath().split(qtiPackageFile.getName())[0];
		String[] directoryName = qtiPackageFile.getName().split(".zip");
		qtiWorkingDirectory = Paths.get(currentWorkingDir + "/" + directoryName[0]);
		
		
		if (!Files.exists(qtiWorkingDirectory)) {
			try {Files.createDirectories(qtiWorkingDirectory);}
			catch (IOException e) {e.printStackTrace();}
			 }
		

		try {
			
			byte[] buffer = new byte[1024];
			ZipInputStream zis;
			zis = new ZipInputStream(new FileInputStream(qtiPackageFile));
			
			ZipEntry zipEntry = zis.getNextEntry();
			
			while(zipEntry != null) {
				String fileName = zipEntry.getName();
				
				if (fileName.contains("/")) {
					String imageFolder = fileName.split("/")[0];
					if(!Files.exists(Paths.get(qtiWorkingDirectory + "/" + imageFolder))) {
						Files.createDirectories(Paths.get(qtiWorkingDirectory + "/" + imageFolder));
					}
					
				}
				
				
				if (!Files.exists(Paths.get(qtiWorkingDirectory + "/" + fileName))) {
					File newFile = new File(qtiWorkingDirectory + "/" + fileName);
					FileOutputStream fos = new FileOutputStream(newFile);
					int len;
					while ((len = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, len);
					}
					
					fos.close();
				}
			
				zipEntry = zis.getNextEntry();
			}
			
			zis.closeEntry();
			zis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	
	/**
	 * This method grabs the data from the manifest object by deserializing the XML
	 * from the unzipped QTI package.
	 */
	private static void retrieveQtiManifestData() {
		
		FileInputStream qtiManifestFile;
		try {
			qtiManifestFile = new FileInputStream(qtiWorkingDirectory + "/" + "imsmanifest.xml");
			
			JAXBContext qtiManifestContext = JAXBContext.newInstance("org.imsglobal.xsd.imscp_v1p1:org.imsglobal.xsd.imsccv1p2.imscsmd_v1p0");
			
			Unmarshaller qtiManifestUnmarshaller = qtiManifestContext.createUnmarshaller();
			
			JAXBElement<ManifestType> qtiManifestElement = (JAXBElement<ManifestType>)qtiManifestUnmarshaller.unmarshal(qtiManifestFile);
			
			qtiManifest = qtiManifestElement.getValue();
		
			qtiManifest.createManifestSkillsArray();
			
			
		} catch (FileNotFoundException|JAXBException e1) {
			e1.printStackTrace();
		} 
				
		}
	
	
	/**
	 * This method grabs the data from each question in the QTI package by
	 * deserializing the XML from the unzipped QTI package.
	 */
    private static void retrieveQuestionContent() {
		
		try {
			JAXBContext qtiQuestionContext = JAXBContext.newInstance("org.imsglobal.xsd.imsqti_v2p1:org.w3._1998.math.mathml");
			
			Unmarshaller qtiQuestionUnmarshaller = qtiQuestionContext.createUnmarshaller();
			
			qtiQuestionsArrayList = new ArrayList<AssessmentItemType>();
					
			for (Map<String, String> m: qtiManifest.getManifestSkillsArray()) {//need to add skills to each question somewhere in here.
				String href = m.keySet().toString().replace("[", "").replace("]", "");
				String skillCode = m.values().toString().replace("[", "").replace("]", "");
				File questionFile = new File(qtiWorkingDirectory + "/" + href);
				
				JAXBElement<AssessmentItemType> question = (JAXBElement<AssessmentItemType>)qtiQuestionUnmarshaller.unmarshal(questionFile);
				AssessmentItemType qtiQuestion = question.getValue();
				qtiQuestion.setQuestionSkill(skillCode);
				qtiQuestion.retrieveQuestionText();
				qtiQuestionsArrayList.add(qtiQuestion);	
				
			}

			
		}
		
		catch (JAXBException e) {e.printStackTrace(); }
	}
	
    /**
     * This method updates the skill codes in both the manifest object and each question object.
     * It takes as an argument a CSV file containing the old skill codes in column one
     * and the new skill codes in column two.
     * @param newSkillsCsv
     */
    
    public static void updateSkillCodes(File newSkillsCsv) {
    	
		CsvHandler csvHandler = new CsvHandler(newSkillsCsv);
		ArrayList<Map<String, String>> hrefsToNewSkillCodes = csvHandler.getHrefsToNewSkillCodes(qtiManifest.getManifestSkillsArray());		

		qtiManifest.updateManifestSkills(hrefsToNewSkillCodes);
		
		for (Map<String, String> m: qtiManifest.getManifestSkillsArray()) {
			String href = m.keySet().toString().replace("[", "").replace("]", "").replaceAll(".xml", "");
			
			String skillCode = m.values().toString().replace("[", "").replace("]", "");
			for (AssessmentItemType a: qtiQuestionsArrayList) {
				if (href.contains(a.getIdentifier())) {
					a.setQuestionSkill(skillCode);
				}
			}
				
		}
    	
    }
    
    /**
     * This method saves the entire QTI package by re-zipping all of the files.
     * It also serializes the new manifest object, as the skill codes could've been changed,
     * during that process. It takes as an argument the new directory to which the user
     * would like to save their files.
     * @param newSaveDirectory
     * @throws IOException
     * @throws JAXBException
     */
    public static void zipQtiDirectory(File newSaveDirectory) throws IOException, JAXBException {
    	
		File QtiWorkingDirectory = new File(qtiWorkingDirectory.toUri());
		FileOutputStream fos = new FileOutputStream(newSaveDirectory);
		ZipOutputStream zos = new ZipOutputStream(fos);
		zipQtiFiles(QtiWorkingDirectory, QtiWorkingDirectory.getName(), zos);
		zos.close();
		fos.close();
    	
    }
    
    /**
     * This method recursively zips all of the files in the QTI package directory.
     * @param workingDirectory
     * @param fileName
     * @param zos
     * @throws IOException
     * @throws JAXBException
     */
    private static void zipQtiFiles(File workingDirectory, String fileName, ZipOutputStream zos) throws IOException, JAXBException {
   
    		if (workingDirectory.isHidden()) {
			return;
    			}
		
		if (workingDirectory.isDirectory()) {
			File[] children = workingDirectory.listFiles();
			
			if (workingDirectory.getName().contains("images")) {
				for (File childFile : children) {
					zipQtiFiles(childFile, "images" + "/" + childFile.getName(), zos);}
				
			}
			
			if (workingDirectory.getName().contains("media")) {
				for (File childFile : children) {
					zipQtiFiles(childFile, "media" + "/" + childFile.getName(), zos);}
				
			}
			
			else {
				for (File childFile : children) {
					zipQtiFiles(childFile, childFile.getName(), zos);}
			}
			
			return;
		}
		
		if (workingDirectory.getName().contains("imsmanifest.xml")) {
			
			ZipEntry zipEntry = new ZipEntry("imsmanifest.xml");
			zos.putNextEntry(zipEntry);
			
			JAXBContext qtiManifestcontext = JAXBContext.newInstance("org.imsglobal.xsd.imscp_v1p1:org.imsglobal.xsd.imsccv1p2.imscsmd_v1p0");
			Marshaller qtiManifesftMarshaller = qtiManifestcontext.createMarshaller();
			qtiManifesftMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); //sets indents + tabs in xml output
			qtiManifesftMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.imsglobal.org/xsd/imsccv1p2/imscsmd_v1p0 http://www.imsglobal.org/profile/cc/ccv1p2/ccv1p2_imscsmd_v1p0.xsd");
			qtiManifesftMarshaller.marshal(qtiManifest, zos);
			return;
			
		}
		
		FileInputStream fis = new FileInputStream(workingDirectory);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zos.putNextEntry(zipEntry);
		byte[] bytes = new byte[1024];
		int length;
		while((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}
		
		fis.close();
		
    }

}
