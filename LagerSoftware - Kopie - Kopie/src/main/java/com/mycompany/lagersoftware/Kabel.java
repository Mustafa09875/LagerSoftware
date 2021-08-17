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
public class Kabel extends Technik{
    private String laenge;
    public Kabel(String name, double mietPreiproStunde, String beschreibung) {
        super(name, mietPreiproStunde, beschreibung);
    }

    @Override
    public void datenAusgeben() {
    }

    public String getLaenge() {
        return laenge;
    }

    public void setLaenge(String laenge) {
        this.laenge = laenge;
    }
    
    
    
}
