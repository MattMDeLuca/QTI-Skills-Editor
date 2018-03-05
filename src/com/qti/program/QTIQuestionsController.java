package com.qti.program;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.imsglobal.xsd.imscp_v1p1.ManifestType;
import org.imsglobal.xsd.imsqti_v2p1.AssessmentItemType;

import javafx.beans.binding.StringExpression;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


/**
 * This class controls the screen where the QTI questions are displayed, skills updated, and QTI packages saved.
 * 
 * @author Matt DeLuca
 *
 */
public class QTIQuestionsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<AssessmentItemType, String>  questionContent;
    
    @FXML
    private TableColumn<AssessmentItemType, String> questionSkills;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableColumn<AssessmentItemType, String> questionTitle;

    @FXML
    private TableView<AssessmentItemType> table;
    
    @FXML
    private Label skillsNoteLabel;
    
    @FXML
    private Button updateSkills;
    
    @FXML
    private MenuBar menuBar;
    
    @FXML
    private Menu fileMenu;
    
    @FXML
    private MenuItem importMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem saveMenuItem;

    
    private static ObservableList<AssessmentItemType> qtiQuestionsToTable;
    
    private static ArrayList<AssessmentItemType> qtiQuestionsFromClass;
    


    @FXML
    void updateSkillsClick(ActionEvent event) { //This method updates the skill codes in the QTI Questions and Manifest.
    		Stage stage = (Stage) updateSkills.getScene().getWindow();
    		FileChooser fileChooser = new FileChooser();
    		File newSkillCodes = fileChooser.showOpenDialog(stage);
    		
    		if (newSkillCodes == null) {
    			return;
    		}
    		
    		if (!newSkillCodes.getName().contains(".csv") || !newSkillCodes.isFile()) {
			Alert alert = new Alert(AlertType.INFORMATION, "You have chosen an incorrect file. Please select a proper skills file."); 
			alert.setHeaderText(null);
			alert.setTitle("Incorrect Skills File");
		    	alert.showAndWait();
    		}
    		
    		else {
    			
        		QTIHandler.updateSkillCodes(newSkillCodes); // Call method from QTIHandler and pass it the new skill code file.
        		qtiQuestionsToTable.clear();	
        		qtiQuestionsFromClass.forEach(x -> qtiQuestionsToTable.add(x)); //Update the table.
        		table.setItems(qtiQuestionsToTable);
    			
    		}
    		

    }
    
    @FXML
    void fileMenuClick(ActionEvent event) {

    }
    
    @FXML
    void importMenuItemSelect(ActionEvent event) {
    	try {
    		Stage stage = (Stage) anchorPane.getScene().getWindow();
    		Parent root = FXMLLoader.load(getClass().getResource("QTIMain.fxml"));
    		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    	}
    	
    	catch(IOException e) {e.printStackTrace();}	

    }

   
    @FXML
    void saveMenuItemClick(ActionEvent event) {
    	
    		Stage stage = (Stage) anchorPane.getScene().getWindow();
    		FileChooser fileChooser = new FileChooser();
    		FileChooser.ExtensionFilter zipExtFiler = new FileChooser.ExtensionFilter("Zip file", ".zip");
    		fileChooser.setSelectedExtensionFilter(zipExtFiler);
		File newSaveDirectory = fileChooser.showSaveDialog(stage);
		
		
		if (newSaveDirectory == null) {return;}
		
		if (!newSaveDirectory.getName().contains(".zip")) {
    			Alert alert = new Alert(AlertType.INFORMATION, "You must save as a zip file. Please add the proper file extension to your save file.");
    			alert.setHeaderText(null);
    			alert.setTitle("Missing File Extension");
    			alert.showAndWait();
  
		}
		
		else {
			try {
				QTIHandler.zipQtiDirectory(newSaveDirectory);
			}
			
			catch (IOException| JAXBException e) {
				e.printStackTrace();
			}
			
			
		}
		
    }

    @FXML
    void closeMenuItemClick(ActionEvent event) {
    		Stage stage = (Stage) anchorPane.getScene().getWindow();
    		Alert alert = new Alert(AlertType.INFORMATION, "Are you sure you want to close?"); //Create a dialog to alert users they have not entered text.
		alert.setHeaderText(null);
		alert.setTitle("Close QTI Questions");
		alert.showAndWait();
		if (alert.getResult() == ButtonType.OK) {
			stage.close();
		}
    		
    }

    @FXML
    void initialize(File qtiPackage) { //This stage is initialized with the data in the table.
    		qtiQuestionsToTable = FXCollections.observableArrayList(); //Create an observable array because that's all tableview can take.
		qtiQuestionsFromClass = QTIHandler.populateQTIQuestions(qtiPackage); //Call for the daya from the QTI package.
		
		qtiQuestionsFromClass.forEach(x -> qtiQuestionsToTable.add(x));
		
		
		Font defaultFont = Font.getDefault();
		
		System.out.println(defaultFont);
		
		questionSkills.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getQuestionSkill()));

		
		questionContent.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getQuestionText()));
		
		questionContent.setCellFactory(cellData -> { 
			return new TableCell<AssessmentItemType, String>() {
				@Override
				protected void updateItem(String item, boolean empty) {
					if(item == null || empty) {
						setText("");
						setStyle("");
					}
					
					else {
						WebView web = new WebView();
						web.setPrefHeight(75);
						WebEngine engine = web.getEngine();
						engine.loadContent(item);
						engine.setUserStyleSheetLocation("data:,body { font: " + Font.getDefault().getName() + "; }");
						
						//engine.setUserStyleSheetLocation(value);
						setGraphic(web);
					}
				}
			};
		});

		questionTitle.setCellValueFactory(cellData -> new ReadOnlyStringWrapper(cellData.getValue().getTitle()));
		
		table.setItems(qtiQuestionsToTable);
		
		
        assert questionContent != null : "fx:id=\"questionContent\" was not injected: check your FXML file 'testTableLoad.fxml'.";
        assert anchorPane != null : "fx:id=\"anchorPane\" was not injected: check your FXML file 'testTableLoad.fxml'.";
        assert questionTitle != null : "fx:id=\"questionTitle\" was not injected: check your FXML file 'testTableLoad.fxml'.";
        assert table != null : "fx:id=\"table\" was not injected: check your FXML file 'testTableLoad.fxml'.";
    }

 }

