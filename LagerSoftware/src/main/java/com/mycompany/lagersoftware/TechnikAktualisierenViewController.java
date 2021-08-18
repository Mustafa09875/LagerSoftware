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
    private TextField TxtFMonitorZollangabe;
    @FXML
    private AnchorPane AnchorPaneAktualEntfernen;
    @FXML
    private BorderPane BorderPainAktualisierungsViewEntfernen;
    @FXML
    private AnchorPane AnchorPaneViewAktual;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AnchorPaneAktualEntfernen.setVisible(false);
        
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
            TxtFPlatteMasse.setText(sMasse);TxtFPlatteMietpreis.setText(sPreis);
        } else if(App.getSelectedTechnik().getClass().equals(k1.getClass())){
            App.setSelectedKabel((Kabel) App.getSelectedTechnik());
            
            String sPreis = String.valueOf(App.getSelectedKabel().getMietPreiproStunde());
            String sLaenge = String.valueOf(App.getSelectedKabel().getLaenge());
            
            TxtFKabelName.setText(App.getSelectedKabel().getName());
            TxtFKabelBeschreibung.setText(App.getSelectedKabel().getBeschreibung());
            TxtFKabelMietpreis.setText(sPreis);
            TxtFKabelLaenge.setText(sLaenge);
                    
        } else if(App.getSelectedTechnik().getClass().equals(m1.getClass())){
            App.setSelectedMonitor((Monitor) App.getSelectedTechnik());
            
            String sPreis = String.valueOf(App.getSelectedMonitor().getMietPreiproStunde());
            String sZoll = String.valueOf(App.getSelectedMonitor().getZollangabe());
            
            TxtFMonitorName.setText(App.getSelectedMonitor().getName());
            TxtFMonitorBeschreibung.setText(App.getSelectedMonitor().getBeschreibung());
            TxtFMonitorMietpreis.setText(sPreis);
            TxtFMonitorZollangabe.setText(sZoll);
        
         } else if(App.getSelectedTechnik().getClass().equals(p1.getClass())){
             App.setSelectedPult((Pult) App.getSelectedTechnik());
             
             String sPreis = String.valueOf(App.getSelectedPult().getMietPreiproStunde());
             String sKanaele = String.valueOf(App.getSelectedPult().getKanaele());
             
             TxtFPultName.setText(App.getSelectedPult().getName());
             TxtFPultBeschreibung.setText(App.getSelectedPult().getBeschreibung());
             TxtFPultMietpreis.setText(sPreis);
             TxtFPultKanele.setText(sKanaele);
         
         } else if(App.getSelectedTechnik().getClass().equals(t1.getClass())){
             App.setSelectedTraverse((Traversen) App.getSelectedTechnik());
             
              String sPreis = String.valueOf(App.getSelectedTraverse().getMietPreiproStunde());
              String sLaenge = String.valueOf(App.getSelectedTraverse().getLaenge());
             
             TxtFTraversName.setText(App.getSelectedTraverse().getName());
             TxtFTraversBeschreibung.setText(App.getSelectedTraverse().getName());
             TxtFTraversMietpreis.setText(sPreis);
             TxtFTraversArt.setText(App.getSelectedTraverse().getArt());
             TxtFTraversLaenge.setText(sLaenge);
             
             
         }
    }
       

     @FXML
    private void BtnSaveBoxen(ActionEvent event) throws IOException {
        double sPreis = Double.parseDouble(TxtFBoxenMietpreis.getText());
        double sGewicht = Double.parseDouble(TxtFBoxenGewicht.getText());
        
        App.getSelectedBox().setName(TxtFBoxenName.getText());
        App.getSelectedBox().setBeschreibung(TxtFBoxenBeschreibung.getText());
        App.getSelectedBox().setGewicht(sGewicht);
        App.getSelectedBox().setMietPreiproStunde(sPreis);
        
    }

    @FXML
    private void BtnSaveKabel(ActionEvent event) throws IOException {
        double sPreis = Double.parseDouble(TxtFKabelMietpreis.getText());
        double sLaenge = Double.parseDouble(TxtFKabelLaenge.getText());
        
        App.getSelectedKabel().setName(TxtFKabelName.getText());
        App.getSelectedKabel().setBeschreibung(TxtFKabelBeschreibung.getText());
        App.getSelectedKabel().setMietPreiproStunde(sPreis);
        App.getSelectedKabel().setLaenge(sLaenge);
        
    }

    @FXML
    private void BtnSaveTravers(ActionEvent event) throws IOException {
        double sLaenge = Double.parseDouble(TxtFTraversLaenge.getText());
        double sPreis = Double.parseDouble(TxtFTraversMietpreis.getText());
        
        App.getSelectedTraverse().setArt(TxtFTraversArt.getText());
        App.getSelectedTraverse().setLaenge(sLaenge);
        App.getSelectedTraverse().setBeschreibung(TxtFTraversBeschreibung.getText());
        App.getSelectedTraverse().setName(TxtFTraversName.getText());
        App.getSelectedTraverse().setMietPreiproStunde(sPreis);
    }

    @FXML
    private void BtnSavePult(ActionEvent event) throws IOException {
        double sPreis = Double.parseDouble(TxtFPultMietpreis.getText());
        double sKanal = Double.parseDouble(TxtFPultKanele.getText());
        
        App.getSelectedPult().setName(TxtFPultName.getText());
        App.getSelectedPult().setKanaele(sKanal);
        App.getSelectedPult().setMietPreiproStunde(sPreis);
        App.getSelectedPult().setBeschreibung(TxtFPultBeschreibung.getText());
        
        
       
    }

    @FXML
    private void BtnSavePlatte(ActionEvent event) throws IOException {
        double sPreis = Double.parseDouble(TxtFPlatteMietpreis.getText());
       
    
        App.getSelectedPlatte().setName(TxtFPlatteName.getText());
        App.getSelectedPlatte().setMietPreiproStunde(sPreis);
        App.getSelectedPlatte().setBeschreibung(TxtFPlatteBeschreibung.getText());
        App.getSelectedPlatte().setMaBe(TxtFPlatteMasse.getText());
    }

    @FXML
    private void BtnSaveMonitor(ActionEvent event) throws IOException {
        double sPreis = Double.parseDouble(TxtFMonitorMietpreis.getText());
        double sZoll = Double.parseDouble(TxtFMonitorZollangabe.getText());
       
        App.getSelectedMonitor().setName(TxtFMonitorName.getText());
        App.getSelectedMonitor().setBeschreibung(TxtFMonitorBeschreibung.getText());
        App.getSelectedMonitor().setMietPreiproStunde(sPreis);
        App.getSelectedMonitor().setZollangabe(sZoll);
        
        
            AnchorPaneViewAktual.setVisible(false);
            AnchorPaneAktualEntfernen.setVisible(true);
            AnchorPane  pane = FXMLLoader.load(getClass().getResource("LagerVerwaltungView.fxml"));      
            BorderPainAktualisierungsViewEntfernen.setCenter(pane);
        
    }


    
}
