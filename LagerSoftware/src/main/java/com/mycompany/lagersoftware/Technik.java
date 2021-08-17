package com.mycompany.lagersoftware;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Test
 */
public abstract class Technik {
    private String name;
    private double mietPreiproStunde;
    private String beschreibung;

    public Technik(String name, double mietPreiproStunde, String beschreibung) {
        this.name = name;
        this.mietPreiproStunde = mietPreiproStunde;
        this.beschreibung = beschreibung;
    }
    
    public abstract void datenAusgeben();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMietPreiproStunde() {
        return mietPreiproStunde;
    }

    public void setMietPreiproStunde(double mietPreiproStunde) {
        this.mietPreiproStunde = mietPreiproStunde;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    
    
}
