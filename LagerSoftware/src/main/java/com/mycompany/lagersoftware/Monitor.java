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

    @Override
    public String datenAusgeben() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
}
