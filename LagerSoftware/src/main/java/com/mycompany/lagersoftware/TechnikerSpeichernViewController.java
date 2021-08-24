/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lagersoftware;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class TechnikerSpeichernViewController implements Initializable {

    @FXML
    private TabPane TabPane;
    @FXML
    private TextField TxtFTechnikerVorname;
    @FXML
    private TextField TxtFTechnikerNachname;
    @FXML
    private TextField TxtFTechnikerStundensatz;
    @FXML
    private TextField TxtFTechnikerBeschreibung;
    @FXML
    private AnchorPane BtnTechnikAnpassen;
    @FXML
    private ListView<String> LWTechnikAnpassen;
    @FXML
    private BorderPane BorderPaneTechniker;
    @FXML
    private Label LabelGespeicherTechniker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LabelGespeicherTechniker.setVisible(false);
         LabelGespeicherTechniker.setVisible(false);
        
        BorderPaneTechniker.setVisible(false);
         for(Techniker t: App.getTechniker()){
            LWTechnikAnpassen.getItems().add(t.datenAusgeben());
      }
        
    }    
    
    
    @FXML
    private void BtnTechnikerSpeichern(ActionEvent event) {
        double sLohn = Double.parseDouble(TxtFTechnikerStundensatz.getText());
        Techniker tk1 = new Techniker(TxtFTechnikerVorname.getText(), TxtFTechnikerNachname.getText(), sLohn, TxtFTechnikerBeschreibung.getText());
        App.getTechniker().add(tk1);
                LabelGespeicherTechniker.setVisible(true);

        LWTechnikAnpassen.getItems().clear();
        for(Techniker t: App.getTechniker()){
        LWTechnikAnpassen.getItems().add(t.datenAusgeben());
        
      }
    }

    @FXML
    private void LWTechnikerSelect(MouseEvent event) {
         LabelGespeicherTechniker.setVisible(false);
        int index = LWTechnikAnpassen.getSelectionModel().getSelectedIndex();
        
        App.setSelectedTechniker(App.getTechniker().get(0));
    }
    

    @FXML
    private void BtnLWTechnikerBearbeiten(ActionEvent event) throws IOException {
         LabelGespeicherTechniker.setVisible(false);
        BorderPaneTechniker.setVisible(true);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("TechnikerAktualisierenView.fxml"));
        BorderPaneTechniker.setCenter(pane);
        
    
    }

    @FXML
    private void BtnLwTechnikerLöschen(ActionEvent event) {
         LabelGespeicherTechniker.setVisible(false);
        int index = LWTechnikAnpassen.getSelectionModel().getSelectedIndex();
        
        App.getTechniker().remove(0);
        
        LWTechnikAnpassen.getItems().clear();
        for(Techniker t: App.getTechniker()){
            LWTechnikAnpassen.getItems().add(t.datenAusgeben());
      }
        
    }
    
}
