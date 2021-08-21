package com.mycompany.lagersoftware;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {
    
    private static HashMap<Technik,Integer> technikObjekte;
    private static ArrayList<Kunde> kunden;
    private static ArrayList<Techniker> techniker;
    private static ArrayList<Vermietung> vermietungen;
    
    private static Kunde selectedKunde;
    private static Techniker selectedTechniker;
    private static Technik selectedTechnik;
    private static Boxen selectedBox;
    private static Buehnenplatte selectedPlatte;
    private static Kabel selectedKabel;
    private static Monitor selectedMonitor;
    private static Pult selectedPult;
    private static Traversen selectedTraverse;

    public static Kunde getSelectedKunde() {
        return selectedKunde;
    }

    public static void setSelectedKunde(Kunde selectedKunde) {
        App.selectedKunde = selectedKunde;
    }

    public static Techniker getSelectedTechniker() {
        return selectedTechniker;
    }

    public static void setSelectedTechniker(Techniker selectedTechniker) {
        App.selectedTechniker = selectedTechniker;
    }

    public static Boxen getSelectedBox() {
        return selectedBox;
    }

    public static void setSelectedBox(Boxen selectedBox) {
        App.selectedBox = selectedBox;
    }

    public static Buehnenplatte getSelectedPlatte() {
        return selectedPlatte;
    }

    public static void setSelectedPlatte(Buehnenplatte selectedPlatte) {
        App.selectedPlatte = selectedPlatte;
    }

    public static Kabel getSelectedKabel() {
        return selectedKabel;
    }

    public static void setSelectedKabel(Kabel selectedKabel) {
        App.selectedKabel = selectedKabel;
    }

    public static Monitor getSelectedMonitor() {
        return selectedMonitor;
    }

    public static void setSelectedMonitor(Monitor selectedMonitor) {
        App.selectedMonitor = selectedMonitor;
    }

    public static Pult getSelectedPult() {
        return selectedPult;
    }

    public static void setSelectedPult(Pult selectedPult) {
        App.selectedPult = selectedPult;
    }

    public static Traversen getSelectedTraverse() {
        return selectedTraverse;
    }

    public static void setSelectedTraverse(Traversen selectedTraverse) {
        App.selectedTraverse = selectedTraverse;
    }

    public static Technik getSelectedTechnik() {
        return selectedTechnik;
    }

    public static void setSelectedTechnik(Technik selectedTechnik) {
        App.selectedTechnik = selectedTechnik;
    }
    public static ArrayList<Vermietung> getVermietungen() {
        return vermietungen;
    }

    public static void setVermietungen(ArrayList<Vermietung> vermietungen) {
        App.vermietungen = vermietungen;
    }

    public static ArrayList<Techniker> getTechniker() {
        return techniker;
    }

    public static void setTechniker(ArrayList<Techniker> techniker) {
        App.techniker = techniker;
    }

    public static ArrayList<Kunde> getKunden() {
        return kunden;
    }

    public static void setKunden(ArrayList<Kunde> kunden) {
        App.kunden = kunden;
    }

    public static HashMap getTechnikObjekte() {
        return technikObjekte;
    }

    public static void setTechnikObjekte(HashMap technikObjekte) {
        App.technikObjekte = technikObjekte;
    }

    private static Scene scene;
    private static ArrayList<Technik> technik;

    public static ArrayList<Technik> getTechnik() {
        return technik;
    }

    public static void setTechnik(ArrayList<Technik> technik) {
        App.technik = technik;
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("MainView"), 780, 500);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        technik = new ArrayList<>();
        
        technikObjekte = new HashMap();
        
        Boxen bo = new Boxen("boxi",10.00,"a",37.00);
        Pult pu = new Pult("pulti",10.00,"a",37.00);
        Buehnenplatte bue = new Buehnenplatte("buehnenplatte",10.00,"a","i");
        Kabel ka = new Kabel("Kabel",10.00,"Caleb a",37.00);
        Traversen tra = new Traversen("Travers",10.00,"von Travis Scott","a",12.00);
        Monitor mo = new Monitor("Monitor",10.00,"Motomoto",37.00);
        
        App.getTechnik().add(bo);
        App.getTechnik().add(pu);
        App.getTechnik().add(bue);
        App.getTechnik().add(ka);
        App.getTechnik().add(tra);
        App.getTechnik().add(mo);
        technikObjekte.put(bo, 50);
        technikObjekte.put(pu, 50);
        technikObjekte.put(ka, 50);
        technikObjekte.put(bue, 50);
        technikObjekte.put(tra, 50);
        technikObjekte.put(mo, 50);
        
        kunden = new ArrayList<Kunde>();
        
        PrivateKundeModel pk = new PrivateKundeModel("Kudi","Budi","schmudi");
        GeschaeftsKundeModel gk = new GeschaeftsKundeModel("Ki","Bi","si","Gymhum");
        PrivateKundeModel pk1 = new PrivateKundeModel("Pudel","Mudel","3D");
        GeschaeftsKundeModel gk1 = new GeschaeftsKundeModel("Wendy","sus","si","Gymhum");
        GeschaeftsKundeModel gk2 = new GeschaeftsKundeModel("This","is","a","robbery");
        
        kunden.add(pk);
        kunden.add(gk);
        kunden.add(pk1);
        kunden.add(gk1);
        kunden.add(gk2);
        
        techniker = new ArrayList<Techniker>();
        
        Techniker t = new Techniker("Eren","Jaeger",100.00,"Freiheit");
        Techniker t1 = new Techniker("Drunk","the Dank",100.00,"Wein");
        Techniker t2 = new Techniker("Checki","Chan",100.00,"BruceLeee");
        
        techniker.add(t);
        techniker.add(t1);
        techniker.add(t2);
        
        vermietungen = new ArrayList<Vermietung>();
        
        
      //  Vermietung v = new Vermietung(pk,"12.12.2001","12.02.2021",4);
        
        launch();
    }

}
/*private ArrayList<Techniker>techniker;
private Kunde kunde;
private HashMap<Technik, Integer> objekte;
private String start;
private String ende;
private int kosten;
private int stunden;*/