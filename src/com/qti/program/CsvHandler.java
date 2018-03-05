package com.qti.program;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * This class handles parsing the CSV containing the new skill codes.
 * It's in a separate class from the other QTI handling because I might change
 * the implementation.
 * @author Matt DeLuca
 *
 */
public class CsvHandler {
	
	private File csvFile;
	private ArrayList<Map<String, String>> newSkillCodes;
	private ArrayList<Map<String, String>> hrefsToNewSkillCodes;
	private String csvOrFileError;
	
	public CsvHandler(File newSkillsCsv) {
		this.csvFile = newSkillsCsv;
		this.findNewSkills();
	}
	/**
	 * This method parses the CSV to ensure it's properly formatted and the creates
	 * a map with the key as the old skill code and the value as the new skill code. Then it
	 * adds them to an array list.
	 */
	private void findNewSkills() {
		
		if (this.newSkillCodes == null) {newSkillCodes = new ArrayList<Map<String, String>>();}
		
		try {
			Scanner csvFileReader = new Scanner(csvFile);
			Boolean csvOK = null;
			
			while (csvFileReader.hasNextLine()) {
				String[] lineFromCsv = csvFileReader.nextLine().split(",");
				
				if (!lineFromCsv[0].contains("Old Skill") && csvOK == null) {
					csvOrFileError = "Please use a properly formatted CSV.";
					break;			
			    }
				
				if (lineFromCsv[0].contains("Old Skill")) {
					csvOK = true;
					continue;
				}
				
				else {
					Map<String, String> skillsMap = new HashMap<String, String>();
					skillsMap.put(lineFromCsv[0], lineFromCsv[1]);
					newSkillCodes.add(skillsMap);
				}
		    }
			
			csvFileReader.close();	
		}
			
		catch(FileNotFoundException e) {
			csvOrFileError = "There was an error with the file.";	
	}
  }
	/**
	 * This method creates an array of maps that contains the href to each question file as the key
	 * and the new skill code as the values. 
	 * @param currentSkillCodes
	 */
	private void setHrefsToNewSkills(ArrayList<Map<String, String>> currentSkillCodes) {
		
		if (this.hrefsToNewSkillCodes == null) {hrefsToNewSkillCodes = new ArrayList<Map<String, String>>();}
		
		for (Map<String, String> m: this.newSkillCodes) { //separate out the skills in the csv
			String newSkill = m.values().toString().replace("[", "").replace("]", "");
			String oldSkillToBeChanged = m.keySet().toString().replace("[", "").replace("]", "");
			
			for (Map<String, String> m2: currentSkillCodes) { //loop through the existing skills
				String href = m2.keySet().toString().replace("[", "").replace("]", "");
				String oldSkillinObject = m2.values().toString().replace("[", "").replace("]", "");

				if (oldSkillToBeChanged.contains(oldSkillinObject)) {
					Map<String, String> hrefToSkill = new HashMap<String, String>();
					hrefToSkill.put(href, newSkill);
					this.hrefsToNewSkillCodes.add(hrefToSkill);
				}
			}
			
		}
		
	}
	

	
	public ArrayList<Map<String, String>> getNewSkillCodes() {
		return this.newSkillCodes;

	}
	
	public ArrayList<Map<String, String>> getHrefsToNewSkillCodes(ArrayList<Map<String, String>> manifestSkills) {
		setHrefsToNewSkills(manifestSkills);
		return this.hrefsToNewSkillCodes;
	}
	
	public String getErrorList() {
		return csvOrFileError;
	}
}
