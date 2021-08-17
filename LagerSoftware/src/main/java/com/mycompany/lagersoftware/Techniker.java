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
public class Techniker extends Person{
    private double Stundensatz;
    private String Beschreibung;

    public double getStundensatz() {
        return Stundensatz;
    }

    public void setStundensatz(double Stundensatz) {
        this.Stundensatz = Stundensatz;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String Beschreibung) {
        this.Beschreibung = Beschreibung;
    }

    public Techniker(String vorname, String nachname, double Stundensatz, String Beschreibung ) {
        super(vorname, nachname);
        this.Stundensatz = Stundensatz;
        this.Beschreibung = Beschreibung;
    }
   
    
    
}
