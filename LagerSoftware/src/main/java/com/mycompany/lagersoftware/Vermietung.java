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
    private HashMap<Technik, Integer> objekte;
    private String start;
    private String ende;
    private double kosten;
    private double stunden;

    //Todo: Techniker in den Konstruktor adden, damit ich ihn auch in meine Vermietung hinzufügen kann

    public Vermietung(Kunde kunde, String start, String ende, double stunden) {
        this.kunde = kunde;
        this.start = start;
        this.ende = ende;
        this.stunden = stunden;
    }

    public ArrayList<Techniker> getTechniker() {
        return techniker;
    }

    public void setTechniker(ArrayList<Techniker> techniker) {
        this.techniker = techniker;
    }

    public double getKosten() {
        return kosten;
    }

    public void setKosten(double kosten) {
        this.kosten = kosten;
    }

    public double getStunden() {
        return stunden;
    }

    public void setStunden(double stunden) {
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
    
    

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
