/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lagersoftware;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
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
    @FXML
    private TextField txtStart;
    @FXML
    private TextField txtEnde;
    @FXML
    private TextField txtStunden;
    @FXML
    private Label lbPreis;
    @FXML
    private TextField txtAnzahl;
    
    private ArrayList<Techniker> techniker;
    private HashMap<Technik,Integer>technik;
    @FXML
    private AnchorPane AnchorPaneVermietungAnzeigen;
    @FXML
    private AnchorPane AnchorPaneVermietungAnlegen;
    @FXML
    private ListView<String> LwVermietung;
    @FXML
    private Label LabelVSpeichern;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lwKunde.getItems().clear();
        for(Kunde k : App.getKunden()){
            lwKunde.getItems().add(k.getVorname()+" "+k.getNachname());
        }
        lwTechniker.getItems().clear();
        for(Techniker t : App.getTechniker()){
            lwTechniker.getItems().add(t.getVorname()+" "+t.getNachname());
        }
        lwTechnik.getItems().clear();
        for(Technik t : App.getTechnik()){
            lwTechnik.getItems().add(t.getName()+" "+t.getBeschreibung());
        }
        techniker = new ArrayList<Techniker>();
        technik = new HashMap();
        
        LwVermietung.getItems().clear();
        for(Vermietung v : App.getVermietungen() ){
             LwVermietung.getItems().add("Kunde:  " + v.getKunde().getVorname() +" "+ v.getKunde().getNachname() +" "+ v.getKunde().klasseAusgeben() +"   Techniker: "+ v.getTechniker().get(0).getVorname()  +" "+ v.getTechniker().get(0).getNachname() +" "+ v.getTechniker().get(0).getClass().getSimpleName() +"   Kosten "+ v.getKosten() +"€   Startdatum: "+ v.getStart() +"   Enddatum: "+ v.getEnde()); 
      }
    }    


    @FXML
    private void btnSelectKunde(MouseEvent event) {
        //Ausgewählter Kunde wird angezeigt
        int index = lwKunde.getSelectionModel().getSelectedIndex();
        App.setSelectedKunde(App.getKunden().get(index));
        lbSelectedKunde.setText(App.getSelectedKunde().getNachname());
        //App.getVermietungen().add(new Vermietung(App.getSelectedKunde(),null,null,0,0));
    }

    @FXML
    private void btnSelectTechniker(MouseEvent event) {
        //Ausgewählter Techniker wird angezeigt
        int index = lwTechniker.getSelectionModel().getSelectedIndex();
        App.setSelectedTechniker(App.getTechniker().get(index));
        lbSelectedTechniker.setText(App.getSelectedTechniker().getNachname());
    }

    @FXML
    private void btnSelectTechnik(MouseEvent event) {
        //Ausgewählte Technik wird angezeigt
        int index = lwTechnik.getSelectionModel().getSelectedIndex();
        App.setSelectedTechnik(App.getTechnik().get(index));
        lbSelectedTechnik.setText(App.getSelectedTechnik().getName());
    }


    @FXML
    private void btnAddTechniker(ActionEvent event) {
        techniker.add(App.getSelectedTechniker());
        System.out.println("Alle Techniker: "+techniker);
    }

    @FXML
    private void btnAddTechnik(ActionEvent event) {
        int anzahl = Integer.parseInt(txtAnzahl.getText());
        technik.put(App.getSelectedTechnik(), anzahl);
        System.out.println("Gewählte Technik: "+technik);
    }

    @FXML
    private void btnSaveVermietung(ActionEvent event) {
        double stunden = Double.valueOf(txtStunden.getText());
        double preis=0;
        
        //Kunde, Start/End datum,Techniker und Technik wird hinzugefuegt
        App.getVermietungen().add(new Vermietung(App.getSelectedKunde(),txtStart.getText(),txtEnde.getText(),stunden, 0.2));
        App.getVermietungen().get(App.getVermietungen().size()-1).setTechniker(techniker);
        App.getVermietungen().get(App.getVermietungen().size()-1).setObjekte(technik);
        
        //Preis anhand des Arbeiters berechnet
        for(Techniker t: App.getVermietungen().get(App.getVermietungen().size()-1).getTechniker()){
            preis = preis + App.getVermietungen().get(App.getVermietungen().size()-1).getStunden()*t.getStundensatz();
        }
        
        //Preis anhand der gemieteten Technik
        for(Entry<Technik, Integer> entry :App.getVermietungen().get(App.getVermietungen().size()-1).getObjekte().entrySet()){
            System.out.println("Anzahl: " +entry.getValue());
            preis = preis + entry.getValue()* entry.getKey().getMietPreiproStunde();
            //Abziehen der Anzahl
            if(entry.getKey() instanceof Boxen){
                App.getTechnikObjekte().replace(App.getTechnik().get(0),(int) (App.getTechnikObjekte().get(App.getTechnik().get(0)))-entry.getValue());
            }else if(entry.getKey() instanceof Pult){
                App.getTechnikObjekte().replace(App.getTechnik().get(1),(int) (App.getTechnikObjekte().get(App.getTechnik().get(1)))-entry.getValue());
            }else if(entry.getKey() instanceof Buehnenplatte){
                App.getTechnikObjekte().replace(App.getTechnik().get(2),(int) (App.getTechnikObjekte().get(App.getTechnik().get(2)))-entry.getValue());
            }else if(entry.getKey() instanceof Kabel){
                App.getTechnikObjekte().replace(App.getTechnik().get(3),(int) (App.getTechnikObjekte().get(App.getTechnik().get(3)))-entry.getValue());
            }else if(entry.getKey() instanceof Traversen){
                App.getTechnikObjekte().replace(App.getTechnik().get(4),(int) (App.getTechnikObjekte().get(App.getTechnik().get(4)))-entry.getValue());
            }else if(entry.getKey() instanceof Monitor){
                App.getTechnikObjekte().replace(App.getTechnik().get(5),(int) (App.getTechnikObjekte().get(App.getTechnik().get(5)))-entry.getValue());
            }
        }
        //Preis wird Kosten uebergeben
        App.getVermietungen().get(App.getVermietungen().size()-1).setKosten(preis);
        
        String kosten = String.valueOf(App.getVermietungen().get(App.getVermietungen().size()-1).getKosten());
        lbPreis.setText(kosten);
        System.out.println("Hash Map: " +App.getTechnikObjekte());
        System.out.println(App.getVermietungen().get(App.getVermietungen().size()-1).getKosten() * 0.2+"<---- Kosten/ Kunde/in ----> "+ App.getVermietungen().get(App.getVermietungen().size()-1).getKunde());
        
         AnchorPaneVermietungAnzeigen.setVisible(true);
      AnchorPaneVermietungAnlegen.setVisible(false);
      LwVermietung.getItems().clear();
        for(Vermietung v : App.getVermietungen() ){
             LwVermietung.getItems().add("Kunde:  " + v.getKunde().getVorname() +" "+ v.getKunde().getNachname() +" "+ v.getKunde().klasseAusgeben() +"   Techniker: "+ v.getTechniker().get(0).getVorname()  +" "+ v.getTechniker().get(0).getNachname() +" "+ v.getTechniker().get(0).getClass().getSimpleName() +"   Kosten "+ v.getKosten() +"€   Startdatum: "+ v.getStart() +"   Enddatum: "+ v.getEnde()); 
      }
        
        LabelVSpeichern.setVisible(false);
      
    }

    @FXML
    private void BtnVermietunganlegen(ActionEvent event) {
        AnchorPaneVermietungAnlegen.setVisible(true);
        AnchorPaneVermietungAnzeigen.setVisible(false);
    }

    @FXML
    private void BtnVermietunganzeigen(ActionEvent event) {
      AnchorPaneVermietungAnzeigen.setVisible(true);
      AnchorPaneVermietungAnlegen.setVisible(false);
      
            LwVermietung.getItems().clear();
        for(Vermietung v : App.getVermietungen() ){
             LwVermietung.getItems().add("Kunde:  " + v.getKunde().getVorname() +" "+ v.getKunde().getNachname() +" "+ v.getKunde().klasseAusgeben() +"   Techniker: "+ v.getTechniker().get(0).getVorname()  +" "+ v.getTechniker().get(0).getNachname() +" "+ v.getTechniker().get(0).getClass().getSimpleName() +"   Kosten "+ v.getKosten() +"€   Startdatum: "+ v.getStart() +"   Enddatum: "+ v.getEnde()); 
      }
      
    }
    
}
