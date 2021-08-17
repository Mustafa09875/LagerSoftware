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
    private String gewicht;

    public Boxen(String name, double mietPreiproStunde, String beschreibung, String gewicht) {
        super(name, mietPreiproStunde, beschreibung);
    }

    @Override
    public void datenAusgeben() {
    }

    public String getGewicht() {
        return gewicht;
    }

    public void setGewicht(String gewicht) {
        this.gewicht = gewicht;
    }
    
    
}
