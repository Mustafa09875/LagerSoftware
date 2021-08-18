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

    public Buehnenplatte(String name, double mietPreiproStunde, String beschreibung, String maBe) {
        super(name, mietPreiproStunde, beschreibung);
        this.maBe = maBe;
    }
    
    

   

    public String getMaBe() {
        return maBe;
    }

    public void setMaBe(String maBe) {
        this.maBe = maBe;
    }

    @Override
    public String datenAusgeben() {
        String sPreis = String.valueOf(this.getMietPreiproStunde());
        
        return "Bühnenplatte" + " - " + this.getName()+ " - "  + sPreis+ " - "  + this.getBeschreibung()+ " - "  + this.getMaBe() ;
    }
    
    
    
}
