/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lagersoftware;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

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
    
    @FXML
    private BorderPane BorderPaneTechnikSelect;

    @FXML
    private AnchorPane AnchorPaneAktualisierungsView;

    /**
     * Initializes the controller class.
     * @param url
     */
    
    public void initialize(URL url, ResourceBundle rb) {
        TabPane.setVisible(false);
        AnchorPaneTechnikAnpassen.setVisible(true);
        AnchorPaneAktualisierungsView.setVisible(false);
      
        

        
         
        
        for(Technik t: App.getTechnik()){
            LWTechnikAnpassen.getItems().add(t.datenAusgeben());
        }
    } 
    
    
    @FXML
    private void BtnTechnikanlegen(ActionEvent event) {
        TabPane.setVisible(true);
        BtnTechnikAnpassen.setVisible(false);
        AnchorPaneAktualisierungsView.setVisible(false);
        
    }

    @FXML
    private void BtnTechnikAnpassen(ActionEvent event) {
     TabPane.setVisible(false);
     AnchorPaneAktualisierungsView.setVisible(false);
     BtnTechnikAnpassen.setVisible(true);
      
    }

    @FXML
    private void BtnTechnikRegale(ActionEvent event) {
        AnchorPaneAktualisierungsView.setVisible(false);
        TabPane.setVisible(false);
        BtnTechnikAnpassen.setVisible(false);
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
        App.getTechnik().add(k1);
    }

    @FXML
    private void BtnSaveTravers(ActionEvent event) {
        double sLaenge = Double.parseDouble(TxtFTraversLaenge.getText());
        double sPreis = Double.parseDouble(TxtFTraversMietpreis.getText());
        Traversen t1 = new Traversen(TxtFTraversName.getText(), sPreis, TxtFTraversBeschreibung.getText(),TxtFTraversArt.getText(), sLaenge );
        App.getTechnik().add(t1);
    }

    @FXML
    private void BtnSavePult(ActionEvent event) {
        double sPreis = Double.parseDouble(TxtFPultMietpreis.getText());
        double sKanal = Double.parseDouble(TxtFPultKanele.getText());
        Pult p1 = new Pult(TxtFPultName.getText(), sPreis, TxtFPultBeschreibung.getText(), sKanal);
        App.getTechnik().add(p1);
    }

    @FXML
    private void BtnSavePlatte(ActionEvent event) {
        double sPreis = Double.parseDouble(TxtFPlatteMietpreis.getText());
       
    
        Buehnenplatte pl1 = new Buehnenplatte(TxtFPlatteName.getText(), sPreis, TxtFPlatteBeschreibung.getText(), TxtFPlatteMasse.getText());
        App.getTechnik().add(pl1);
    }

    @FXML
    private void BtnSaveMonitor(ActionEvent event) {
        double sPreis = Double.parseDouble(TxtFMonitorMietpreis.getText());
        double sZoll = Double.parseDouble(TxtFMonitorZollangabe.getText());
        Monitor m1 = new Monitor (TxtFMonitorName.getText(), sPreis ,TxtFMonitorBeschreibung.getText(), sZoll);
        App.getTechnik().add(m1);
    }

    @FXML
    private void BtnTechnikReload(ActionEvent event) {
        for(int i = 0; i <= App.getTechnik().size(); i++){
            LWTechnikAnpassen.getItems().add(App.getTechnik().get(i).datenAusgeben());
            App.getTechnik().remove(i);
        }
    }



    @FXML
    private void LWTechnikAnspassenSelect(MouseEvent event) throws IOException {

                  int index = LWTechnikAnpassen.getSelectionModel().getSelectedIndex();

       

        App.setSelectedTechnik(App.getTechnik().get(index));
        System.out.println(App.getSelectedTechnik().getName());
 
                
    }


    @FXML
    private void BtnLWBearbeiten(ActionEvent event) throws IOException {

    
         
        

    AnchorPaneAktualisierungsView.setVisible(true);

    System.out.println(App.getTechnik().size());
    AnchorPane  pane = FXMLLoader.load(getClass().getResource("TechnikAktualisierenView.fxml"));

    
   

                    BorderPaneTechnikSelect.setCenter(pane);
                    
                  
      


    }

    @FXML
    private void BtnLwLöschen(ActionEvent event) {
        int index = LWTechnikAnpassen.getSelectionModel().getSelectedIndex();
        App.getTechnik().remove(index);
               AnchorPaneTechnikAnpassen.setVisible(false);
               AnchorPaneTechnikAnpassen.setVisible(true);

        
    }
    
}


