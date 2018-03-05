package com.qti.program;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.zip.ZipFile;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * This class controls the first screen when the program is run, which asks the user to import a QTI package.
 * 
 * @author Matt DeLuca
 *
 */

public class QTIMainController {

    @FXML
    private Button importQTIPackageButton;
    
    @FXML
    private Button updateSkills;
    
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private Label fileToImportLabel;

    @FXML
    private Label importFilename;
    
    @FXML
    void importClick(ActionEvent event) throws Exception {
    		Stage stage = (Stage) importQTIPackageButton.getScene().getWindow();
		FileChooser fileChooser = new FileChooser();
		File qtiPackage = fileChooser.showOpenDialog(stage);
		
		
		if (qtiPackage == null) {
			return;
		}	
		
		if (!qtiPackage.getName().contains(".zip") || !qtiPackage.isFile()) {
				Alert alert = new Alert(AlertType.INFORMATION, "You have chosen an incorrect file. Please select a proper QTI package."); //Create a dialog to alert users they have not entered text.
				alert.setHeaderText(null);
				alert.setTitle("Incorrect QTI Package");
		    		alert.showAndWait();
		    		return;
			}
		
		Predicate<String> hasManifest = x -> x.contains("imsmanifest.xml");
		ZipFile zipTest = new ZipFile(qtiPackage);
		Boolean isQti = zipTest.stream()
				.map(x -> x.getName())
				.anyMatch(hasManifest);
		
		if(!isQti) {
			Alert alert = new Alert(AlertType.INFORMATION, "You have chosen an incorrect file. Please select a proper QTI package."); //Create a dialog to alert users they have not entered text.
			alert.setHeaderText(null);
			alert.setTitle("Incorrect QTI Package");
	    		alert.showAndWait();
	    		return;
		}
		
		
		else {
			importFilename.setText(" " + qtiPackage.getName());
			Button okButton = new Button("Click here to import this file.");
			okButton.setLayoutX(153);
			okButton.setLayoutY(194);
			okButton.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent event) {
					FXMLLoader qtiQuestionsLoader = new FXMLLoader(getClass().getResource("QTIQuestions.fxml"));
					
					try {
						Parent root = qtiQuestionsLoader.load();
						QTIQuestionsController qtiQuestionsController = qtiQuestionsLoader.<QTIQuestionsController>getController();
						qtiQuestionsController.initialize(qtiPackage);
						Scene scene = new Scene(root);
						stage.setScene(scene);
						stage.centerOnScreen();
						stage.show();
						} 
					
					catch (IOException e) {e.printStackTrace();} 
				}
			});
			anchorPane.getChildren().add(okButton);}
		}


    @FXML
    void initialize() {
        assert importQTIPackageButton != null : "fx:id=\"importQTIPackageButton\" was not injected: check your FXML file 'testImportScreen.fxml'.";

    }
}
