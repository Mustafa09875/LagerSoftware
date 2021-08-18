/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lagersoftware;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for(Techniker t: App.getTechniker()){
        LWTechnikAnpassen.getItems().add(t.datenAusgeben());
      }
    }    

    @FXML
    private void BtnTechnikerSpeichern(ActionEvent event) {
        double sLohn = Double.parseDouble(TxtFTechnikerStundensatz.getText());
        Techniker tk1 = new Techniker(TxtFTechnikerVorname.getText(), TxtFTechnikerNachname.getText(), sLohn, TxtFTechnikerBeschreibung.getText());
        App.getTechniker().add(tk1);
    }

    @FXML
    private void LWTechnikerSelect(MouseEvent event) {
        int index = LWTechnikAnpassen.getSelectionModel().getSelectedIndex();
        
        App.setSelectedTechniker(App.getTechniker().get(0));
    }
    

    @FXML
    private void BtnLWTechnikerBearbeiten(ActionEvent event) {
        
    
    }

    @FXML
    private void BtnLwTechnikerLöschen(ActionEvent event) {
        int index = LWTechnikAnpassen.getSelectionModel().getSelectedIndex();
        
        App.getTechniker().remove(0);
        
        for(Techniker t: App.getTechniker()){
            LWTechnikAnpassen.getItems().add(t.datenAusgeben());
      }
        
    }
    
}
