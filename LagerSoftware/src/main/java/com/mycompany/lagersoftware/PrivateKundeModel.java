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
public class PrivateKundeModel extends Kunde{
    
    public PrivateKundeModel(String vorname, String nachname, String adresse) {
        super(vorname, nachname, adresse);
    }

    @Override
    public String datenAusgeben() {
       return "Privatkunde - " + this.getVorname() + " - " + this.getNachname() + " - " + this.getAdresse();
    }

    @Override
    public String klasseAusgeben() {
        return "Privat ";
    }
    
}
