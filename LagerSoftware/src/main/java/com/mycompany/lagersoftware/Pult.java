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
public class Pult extends Technik{
    private double kanaele;
    public Pult(String name, double mietPreiproStunde, String beschreibung, double kanaele) {
        super(name, mietPreiproStunde, beschreibung);
    }

    @Override
    public void datenAusgeben() {
    }

    public double getKanaele() {
        return kanaele;
    }

    public void setKanaele(double kanaele) {
        this.kanaele = kanaele;
    }
    
    
    
}
