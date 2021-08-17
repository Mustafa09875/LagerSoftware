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
public class MonitorModel extends Technik{
    private String zollangabe;
    private String beschreibung;
    public MonitorModel(String name, double mietPreiproStunde, String beschreibung) {
        super(name, mietPreiproStunde, beschreibung);
    }

    
    public void datenAusgeben() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
