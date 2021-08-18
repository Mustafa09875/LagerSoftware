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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class VermietungViewController implements Initializable {

    @FXML
    private HBox LagerVerwaltungHbox;
    @FXML
    private ListView<String> lwKunde;
    @FXML
    private ListView<String> lwTechniker;
    @FXML
    private ListView<String> lwTechnik;
    @FXML
    private Label lbSelectedKunde;
    @FXML
    private Label lbSelectedTechniker;
    @FXML
    private Label lbSelectedTechnik;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        for(Kunde k : App.getKunden()){
            lwKunde.getItems().add(k.getVorname()+" "+k.getNachname());
        }
        
        for(Techniker t : App.getTechniker()){
            lwTechniker.getItems().add(t.getVorname()+" "+t.getNachname());
        }
        
        for(Technik t : App.getTechnik()){
            lwTechnik.getItems().add(t.getName()+" "+t.getBeschreibung());
        }
    }    

    @FXML
    private void BtnTechnikanlegen(ActionEvent event) {
    }

    @FXML
    private void BtnTechnikAnpassen(ActionEvent event) {
    }

    @FXML
    private void BtnTechnikRegale(ActionEvent event) {
    }

    @FXML
    private void btnSelectKunde(MouseEvent event) {
        //Ausgewähltes Auto wird angezeigt
        int index = lwKunde.getSelectionModel().getSelectedIndex();
        App.setSelectedKunde(App.getKunden().get(index));
        lbSelectedKunde.setText(App.getSelectedKunde().getNachname());
    }

    @FXML
    private void btnSelectTechniker(MouseEvent event) {
    }

    @FXML
    private void btnSelectTechnik(MouseEvent event) {
    }


    @FXML
    private void btnAddTechniker(ActionEvent event) {
    }

    @FXML
    private void btnAddTechnik(ActionEvent event) {
    }

    @FXML
    private void btnSaveVermietung(ActionEvent event) {
        //App.getVermietungen().add(new Vermietung(App.getSelectedKunde(),));
    }
    
}
