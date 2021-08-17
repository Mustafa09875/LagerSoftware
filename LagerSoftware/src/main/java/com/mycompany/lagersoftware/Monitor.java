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
public class Monitor extends Technik{
    private double zollangabe;
    public Monitor(String name, double mietPreiproStunde, String beschreibung, double zollangabe) {
        super(name, mietPreiproStunde, beschreibung);
        this.zollangabe = zollangabe;
    }

    public double getZollangabe() {
        return zollangabe;
    }

    public void setZollangabe(double zollangabe) {
        this.zollangabe = zollangabe;
    }

    @Override
    public String datenAusgeben() {
        String sPreis = String.valueOf(this.getMietPreiproStunde());
        String sZoll = String.valueOf(this.getZollangabe());
        return this.getName() + sPreis + this.getBeschreibung() + sZoll ;
    }

    
    
    
    
    
}
