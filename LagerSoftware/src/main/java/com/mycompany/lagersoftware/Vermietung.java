package com.mycompany.lagersoftware;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Test
 */
public  class Vermietung {

    private ArrayList<Techniker>techniker;
    private Kunde kunde;
    private Technik technik;
    private HashMap<Technik, Integer> objekte;
    private String start;
    private String ende;
    private int kosten;
    private int stunden;

    //Todo: Techniker in den Konstruktor adden, damit ich ihn auch in meine Vermietung hinzufügen kann

    public Vermietung(ArrayList<Techniker> techniker, Kunde kunde, Technik technik, HashMap<Technik, Integer> objekte, String start, String ende, int kosten, int stunden) {
        this.techniker = techniker;
        this.kunde = kunde;
        this.technik = technik;
        this.objekte = objekte;
        this.start = start;
        this.ende = ende;
        this.kosten = kosten;
        this.stunden = stunden;
    }

    


    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnde() {
        return ende;
    }

    public void setEnde(String ende) {
        this.ende = ende;
    }

    public HashMap<Technik, Integer> getObjekte() {
        return objekte;
    }

    public void setObjekte(HashMap<Technik, Integer> objekte) {
        this.objekte = objekte;
    }
    
    

   
    
    
    public Techniker getTechniker() {
        return techniker;
    }

    public void setTechniker(Techniker techniker) {
        this.techniker = techniker;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Technik getTechnik() {
        return technik;
    }

    public void setTechnik(Technik technik) {
        this.technik = technik;
    }

}
