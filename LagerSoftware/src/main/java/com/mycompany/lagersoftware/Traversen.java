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
    private double laenge;
    public Traversen(String name, double mietPreiproStunde, String beschreibung, String art, double laenge) {
        super(name, mietPreiproStunde, beschreibung);
        this.art = art;
        this.laenge = laenge;
    }
    

    
   

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    @Override
    public String datenAusgeben() {
       String sPreis = String.valueOf(this.getMietPreiproStunde());
       String sLaenge = String.valueOf(this.getLaenge());
        return this.getName() + sPreis + this.getBeschreibung() + this.getArt() +sLaenge ;
    }
    
    
    
}
