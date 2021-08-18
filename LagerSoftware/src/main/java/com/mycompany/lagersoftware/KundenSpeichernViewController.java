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
    @FXML
    private ListView<String> LWKundenAnpassen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for(Kunde k: App.getKunden()){
            LWKundenAnpassen.getItems().add(k.datenAusgeben());
        }
    }    






    @FXML
    private void BtnPrivatKundeSpeichern(ActionEvent event) {
        PrivateKundeModel pk1 = new PrivateKundeModel(TxtFPrivatKundeVorname.getText(), TxtFPrivatKundeNachname.getText(), TxtFPrivatKundeAdresse.getText());
        App.getKunden().add(pk1);
    }

    @FXML
    private void BtnGeschaeftsKundeSpeichern(ActionEvent event) {
        GeschaeftsKundeModel gk1 = new GeschaeftsKundeModel(TxtFGeschaeftsKundeVorname.getText(), TxtFGeschaeftsKundeNachname.getText(), TxtFGeschaeftsKundeAdresse.getText(), TxtFGeschaeftsKundeFirma.getText());
        App.getKunden().add(gk1);
    }


    @FXML
    private void LWTechnikerSelect(MouseEvent event) {
        int index = LWKundenAnpassen.getSelectionModel().getSelectedIndex();
        App.setSelectedKunde(App.getKunden().get(index));
    }

    @FXML
    private void BtnLwKundenLöschen(ActionEvent event) {
        int index = LWKundenAnpassen.getSelectionModel().getSelectedIndex();
        App.getKunden().remove(index);
    }

    @FXML
    private void BtnLWKundenBearbeiten(ActionEvent event) {
    }


    
}
