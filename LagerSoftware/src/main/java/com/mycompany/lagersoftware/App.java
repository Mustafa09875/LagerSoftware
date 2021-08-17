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
    
    private static HashMap technikObjekte;
    private static ArrayList<Kunde> kunden;
    private static ArrayList<Techniker> techniker;
    private static ArrayList<Vermietung> vermietungen;

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
        
        Boxen bo = new Boxen("a",10.00,"a",37.00);
        Pult pu = new Pult("a",10.00,"a",37.00);
        Buehnenplatte bue = new Buehnenplatte("a",10.00,"a","i");
        Kabel ka = new Kabel("a",10.00,"a",37.00);
        Traversen tra = new Traversen("a",10.00,"a","a",12.00);
        Monitor mo = new Monitor("a",10.00,"a",37.00);
        
        technikObjekte.put(bo, 10);
        technikObjekte.put(pu, 10);
        technikObjekte.put(ka, 10);
        technikObjekte.put(bue, 10);
        technikObjekte.put(mo, 10);
        
        kunden = new ArrayList<Kunde>();
        
        PrivateKundeModel pk = new PrivateKundeModel("Kudi","Budi","schmudi");
        GeschaeftsKundeModel gk = new GeschaeftsKundeModel("Ki","Bi","si","Gymhum");
        PrivateKundeModel pk1 = new PrivateKundeModel("Pudel","Mudel","3D");
        GeschaeftsKundeModel gk1 = new GeschaeftsKundeModel("Wendy","sus","si","Gymhum");
        GeschaeftsKundeModel gk2 = new GeschaeftsKundeModel("This","is","a","robbery");
        
        kunden.add(pk);
        kunden.add(gk);
        kunden.add(pk1);
        kunden.add(pk1);
        kunden.add(gk2);
        
        techniker = new ArrayList<Techniker>();
        
        Techniker t = new Techniker("Eren","Jaeger",100.00,"Freiheit");
        Techniker t1 = new Techniker("Drunk","the Dank",100.00,"Wein");
        Techniker t2 = new Techniker("Checki","Chan",100.00,"BruceLeee");
        
        techniker.add(t);
        techniker.add(t1);
        techniker.add(t2);
        
        vermietungen = new ArrayList<Vermietung>();
        
        
     //   Vermietung v = new Vermietung(new ArrayList<Techniker> techniker,pk, ,"12.12.2001","12.02.2021",13,4);
        
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