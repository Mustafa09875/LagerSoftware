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
    private ListView<?> LWTechnikAnpassen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnTechnikerSpeichern(ActionEvent event) {
    }

    @FXML
    private void LWTechnikerSelect(MouseEvent event) {
    }

    @FXML
    private void BtnLWTechnikerBearbeiten(ActionEvent event) {
    }

    @FXML
    private void BtnLwTechnikerLöschen(ActionEvent event) {
    }
    
}
