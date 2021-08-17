package com.mycompany.lagersoftware;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Test
 */
public  class Vermietung {

    private Techniker techniker;
    private Kunde kunde;
    private Technik technik;
    int technikzeug[][];
    private ArrayList <Technik> technikzeugs;
    private String start;
    private String ende;

    //Todo: Techniker in den Konstruktor adden, damit ich ihn auch in meine Vermietung hinzufügen kann
    public Vermietung(Kunde kunde, Technik technik, String start, String ende) {
        this.techniker = techniker;
        this.kunde = kunde;
        this.technik = technik;
        technikzeug = new int[4][40];
        technikzeugs = new ArrayList <Technik>();
        this.start = start;
        this.ende = ende;
      
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
    
    

    public ArrayList<Technik> getTechnikzeugs() {
        return technikzeugs;
    }

    public void setTechnikzeugs(ArrayList<Technik> technikzeugs) {
        this.technikzeugs = technikzeugs;
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
