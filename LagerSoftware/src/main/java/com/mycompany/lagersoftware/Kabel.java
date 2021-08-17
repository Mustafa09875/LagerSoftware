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
    private double laenge;
    public Kabel(String name, double mietPreiproStunde, String beschreibung, double laenge) {
        super(name, mietPreiproStunde, beschreibung);
        this.laenge = laenge;
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
        return this.getName() + sPreis + this.getBeschreibung() + sLaenge ;
    }

    

   
    
    
    
}
