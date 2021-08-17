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
public class Boxen extends Technik{
    private double gewicht;

    public Boxen(String name, double mietPreiproStunde, String beschreibung, double gewicht) {
        super(name, mietPreiproStunde, beschreibung);
    }

    
    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String datenAusgeben() {
       String sPreis = String.valueOf(this.getMietPreiproStunde());
        String sGewicht = String.valueOf(this.getGewicht());
        return this.getName() + sPreis + this.getBeschreibung() + sGewicht ;
    }
    
    
}
