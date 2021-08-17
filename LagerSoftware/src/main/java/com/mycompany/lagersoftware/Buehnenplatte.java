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
public class Buehnenplatte extends Technik{
    private String maBe;

    public Buehnenplatte(String name, double mietPreiproStunde, String beschreibung) {
        super(name, mietPreiproStunde, beschreibung);
    }
    
    

    @Override
    public void datenAusgeben() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaBe() {
        return maBe;
    }

    public void setMaBe(String maBe) {
        this.maBe = maBe;
    }
    
    
    
}
