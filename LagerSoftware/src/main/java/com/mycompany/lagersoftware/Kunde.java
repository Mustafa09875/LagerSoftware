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
public abstract class Kunde extends Person{
    private String adresse;
   
    public Kunde(String vorname, String nachname, String adresse) {
        super(vorname, nachname);
    }

  
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public abstract String datenAusgeben();
    public abstract String klasseAusgeben();
        
    
}
