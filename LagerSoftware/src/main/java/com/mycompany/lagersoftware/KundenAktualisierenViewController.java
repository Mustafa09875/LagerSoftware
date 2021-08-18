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
public class KundenAktualisierenViewController implements Initializable {

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
    @FXML
    private BorderPane BorderPaneZurück;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BorderPaneZurück.setVisible(false);
        // TODO
    }    

    @FXML
    private void BtnPrivatKundeSpeichern(ActionEvent event) throws IOException {
           BorderPaneZurück.setVisible(true);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("KundenSpeichernView.fxml"));
        BorderPaneZurück.setCenter(pane); 
    }

    @FXML
    private void BtnAbbrechen(ActionEvent event) throws IOException {
        BorderPaneZurück.setVisible(true);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("KundenSpeichernView.fxml"));
        BorderPaneZurück.setCenter(pane); 
    }

    @FXML
    private void BtnGeschaeftsKundeSpeichern(ActionEvent event) throws IOException {
           BorderPaneZurück.setVisible(true);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("KundenSpeichernView.fxml"));
        BorderPaneZurück.setCenter(pane); 
        
    }

    @FXML
    private void BtnAbbrechenGeschaeftskunde(ActionEvent event) throws IOException {
           BorderPaneZurück.setVisible(true);
         AnchorPane pane = FXMLLoader.load(getClass().getResource("KundenSpeichernView.fxml"));
        BorderPaneZurück.setCenter(pane); 
    }
    
}
