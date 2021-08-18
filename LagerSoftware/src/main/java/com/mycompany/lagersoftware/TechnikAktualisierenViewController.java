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
public class TechnikAktualisierenViewController implements Initializable {

    @FXML
    private TabPane TabPane;
    @FXML
    private TextField TxtFBoxenName;
    @FXML
    private TextField TxtFBoxenBeschreibung;
    @FXML
    private TextField TxtFBoxenMietpreis;
    @FXML
    private TextField TxtFBoxenGewicht;
    @FXML
    private TextField TxtFKabelName;
    @FXML
    private TextField TxtFKabelBeschreibung;
    @FXML
    private TextField TxtFKabelMietpreis;
    @FXML
    private TextField TxtFKabelLaenge;
    @FXML
    private TextField TxtFTraversName;
    @FXML
    private TextField TxtFTraversBeschreibung;
    @FXML
    private TextField TxtFTraversMietpreis;
    @FXML
    private TextField TxtFTraversGewicht;
    @FXML
    private TextField TxtFTraversArt;
    @FXML
    private TextField TxtFTraversLaenge;
    @FXML
    private TextField TxtFPultName;
    @FXML
    private TextField TxtFPultBeschreibung;
    @FXML
    private TextField TxtFPultMietpreis;
    @FXML
    private TextField TxtFPultKanele;
    @FXML
    private TextField TxtFPlatteName;
    @FXML
    private TextField TxtFPlatteBeschreibung;
    @FXML
    private TextField TxtFPlatteMietpreis;
    @FXML
    private TextField TxtFPlatteMasse;
    @FXML
    private TextField TxtFMonitorName;
    @FXML
    private TextField TxtFMonitorBeschreibung;
    @FXML
    private TextField TxtFMonitorMietpreis;
    @FXML
    private TextField TxtFMonitorMasse;
    @FXML
    private TextField TxtFMonitorZollangabe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Boxen bo1 = new Boxen("a", 1, "a", 1);
        Buehnenplatte b1 = new Buehnenplatte("a", 1, "a", "1");
        Monitor m1 = new Monitor("a", 1, "a", 1);
        Kabel k1 = new Kabel("a", 1, "a", 1);
        Pult p1 = new Pult("a", 1, "a", 1);
        Traversen t1 = new Traversen("a", 1, "a", "1" ,1);
        if(App.getSelectedTechnik().getClass() == bo1.getClass()){
            App.setSelectedBox((Boxen)App.getSelectedTechnik());
            
            String sGewicht = String.valueOf(App.getSelectedBox().getGewicht());
            String sPreis = String.valueOf(App.getSelectedBox().getMietPreiproStunde());
            
            TxtFBoxenName.setText(App.getSelectedBox().getName());
            TxtFBoxenBeschreibung.setText(App.getSelectedBox().getBeschreibung());
            TxtFBoxenGewicht.setText(sGewicht);
            TxtFBoxenMietpreis.setText(sPreis );
        } else if(App.getSelectedTechnik().getClass().equals(b1.getClass())){
            App.setSelectedPlatte((Buehnenplatte)App.getSelectedTechnik());
            
            String sMasse = String.valueOf(App.getSelectedPlatte().getMaBe());
            String sPreis = String.valueOf(App.getSelectedPlatte().getMietPreiproStunde());
            TxtFPlatteName.setText(App.getSelectedPlatte().getName());
            TxtFPlatteBeschreibung.setText(App.getSelectedPlatte().getName());
            TxtFPlatteMasse.setText(sMasse);
            TxtFPlatteMietpreis.setText(sPreis);
        }
        }
       

    @FXML
    private void BtnSaveBoxen(ActionEvent event) {
    }

    @FXML
    private void BtnSaveKabel(ActionEvent event) {
    }

    @FXML
    private void BtnSaveTravers(ActionEvent event) {
    }

    @FXML
    private void BtnSavePult(ActionEvent event) {
    }

    @FXML
    private void BtnSavePlatte(ActionEvent event) {
    }

    @FXML
    private void BtnSaveMonitor(ActionEvent event) {
    }

    @FXML
    private void BtnAktualisierenBoxen(ActionEvent event) {
    }

    @FXML
    private void BtnAktualisierenKabel(ActionEvent event) {
    }

    @FXML
    private void BtnAktualisierenTraversen(ActionEvent event) {
    }

    @FXML
    private void BtnAktualisierenPult(ActionEvent event) {
    }

    @FXML
    private void BtnAktualisierenBuehnenplatte(ActionEvent event) {
    }

    @FXML
    private void BtnAktualisierenMonitor(ActionEvent event) {
    }
    
}
