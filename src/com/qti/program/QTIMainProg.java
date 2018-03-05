package com.qti.program;

/**
 * This class launches the UI.
 * 
 * @author Matt DeLuca
 *
 */


import java.io.File;
import java.util.ArrayList;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.imsglobal.xsd.imscp_v1p1.ManifestType;
import org.imsglobal.xsd.imsqti_v2p1.AssessmentItemType;


import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class QTIMainProg extends Application {
	@Override
	public void start(Stage stage) throws Exception {
	
			Parent root = 
					FXMLLoader.load(getClass().getResource("QTIMain.fxml")); //Load FXML file to create UI in scene
			Scene scene = new Scene(root);
			stage.setTitle("QTI Skills Updater");	
			stage.setScene(scene);
			stage.show();
			
		}

	
	public static void main(String[] args) {
	   	
		
		
		launch(args); //Launch UI.
	}
	



}
