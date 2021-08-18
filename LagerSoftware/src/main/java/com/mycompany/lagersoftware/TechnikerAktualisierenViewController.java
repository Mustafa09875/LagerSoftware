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
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class TechnikerAktualisierenViewController implements Initializable {

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
    private BorderPane BorderPaneAktualisieren;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        BorderPaneAktualisieren.setVisible(false);
    }    

    @FXML
    private void BtnTechnikerSpeichern(ActionEvent event) throws IOException {
              BorderPaneAktualisieren.setVisible(true);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("TechnikerSpeichernView.fxml"));
        BorderPaneAktualisieren.setCenter(pane);
    }

    @FXML
    private void BtnAbbrechenSpeichern(ActionEvent event) throws IOException {
                 BorderPaneAktualisieren.setVisible(true);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("TechnikerSpeichernView.fxml"));
        BorderPaneAktualisieren.setCenter(pane);
    }
    
}
