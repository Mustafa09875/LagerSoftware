/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lagersoftware;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author Test
 */
public class LagerVerwaltungViewController implements Initializable {

    @FXML
    private TabPane TabPane;
    @FXML
    private HBox LagerVerwaltungHbox;
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
    @FXML
    private AnchorPane AnchorPaneTechnikAnpassen;
    @FXML
    private AnchorPane BtnTechnikAnpassen;
    @FXML
    private ListView<String> LWTechnikAnpassen;
    
    private Technik technik;
    private static ArrayList<Technik> technikarraylist;
    /**
     * Initializes the controller class.
     */
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
         technikarraylist = new ArrayList <Technik>();
       
        
        for(Technik t: getTechnik()){
            LWTechnikAnpassen.getItems().add(t.getName()+ " - "+t.getMietPreiproStunde()+ " - "+t.getBeschreibung()+ " - "+t.getClass().getSimpleName());
        }
        
   }    

    public static ArrayList<Technik> getTechnik() {
        return technikarraylist;
    }

    public static void setTechnik(ArrayList<Technik> technik) {
        LagerVerwaltungViewController.technikarraylist = technik;
    }

   
    
    
    
    @FXML
    private void BtnTechnikanlegen(ActionEvent event) {
        TabPane.setVisible(true);
    }

    @FXML
    private void BtnTechnikAnpassen(ActionEvent event) {
        AnchorPaneTechnikAnpassen.setVisible(true);
        TabPane.setVisible(false);
    }

    @FXML
    private void BtnTechnikRegale(ActionEvent event) {
    }

    @FXML
    private void BtnSaveBoxen(ActionEvent event) {
        double sPreis = Double.parseDouble(TxtFBoxenMietpreis.getText());
        double sGewicht = Double.parseDouble(TxtFBoxenGewicht.getText());
        Boxen b1 = new Boxen(TxtFBoxenName.getText(), sPreis, TxtFBoxenBeschreibung.getText(), sGewicht);
        App.getTechnik().add(b1);
    }

    @FXML
    private void BtnSaveKabel(ActionEvent event) {
        double sPreis = Double.parseDouble(TxtFKabelMietpreis.getText());
        double sLaenge = Double.parseDouble(TxtFKabelLaenge.getText());
        Kabel k1 = new Kabel (TxtFKabelName.getText(), sPreis, TxtFKabelBeschreibung.getText(), sLaenge);
    }

    @FXML
    private void BtnSaveTravers(ActionEvent event) {
        double sLaenge = Double.parseDouble(TxtFTraversLaenge.getText());
        double sPreis = Double.parseDouble(TxtFTraversMietpreis.getText());
        Traversen t1 = new Traversen(TxtFTraversName.getText(), sPreis, TxtFTraversBeschreibung.getText(),TxtFTraversArt.getText(), sLaenge );
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
    
}
