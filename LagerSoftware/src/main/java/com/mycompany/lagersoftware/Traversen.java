/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lagersoftware;

/**
 *
 * @author Test
 */
public class Traversen extends Technik{
    private String art;
    private String laenge;
    public Traversen(String name, double mietPreiproStunde, String beschreibung, String art, String laenge) {
        super(name, mietPreiproStunde, beschreibung);
        this.art = art;
        this.laenge = laenge;
    }
    

    
    public void datenAusgeben() {
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getLaenge() {
        return laenge;
    }

    public void setLaenge(String laenge) {
        this.laenge = laenge;
    }
    
    
    
}
