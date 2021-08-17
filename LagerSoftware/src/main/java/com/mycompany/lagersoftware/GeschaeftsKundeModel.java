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
public class GeschaeftsKundeModel extends Kunde{
    private String firma;
    
    public GeschaeftsKundeModel(String vorname, String nachname, String adresse, String firma) {
        super(vorname, nachname, adresse);
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
    
    
}
