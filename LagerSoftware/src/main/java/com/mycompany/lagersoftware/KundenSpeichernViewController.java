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
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class KundenSpeichernViewController implements Initializable {

    @FXML
    private TabPane TabPane;
    @FXML
    private TextField TxtFPrivatKundeVorname;
    @FXML
    private TextField TxtFPrivatKundeNachname;
    @FXML
    private TextField TxtFPrivatKundeAdresse;
    @FXML
    private TextField TxtFGeschaeftsKundeVorname;
    @FXML
    private TextField TxtFGeschaeftsKundeNachname;
    @FXML
    private TextField TxtFGeschaeftsKundeAdresse;
    @FXML
    private TextField TxtFGeschaeftsKundeFirma;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnPrivatKundeSpeichern(ActionEvent event) {
    }

    @FXML
    private void BtnGeschaeftsKundeSpeichern(ActionEvent event) {
    }
    
}
