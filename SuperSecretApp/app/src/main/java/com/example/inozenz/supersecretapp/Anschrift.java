/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inozenz.supersecretapp;

import java.io.Serializable;

/**
 *
 * @author Inozenz
 */
public class Anschrift implements Serializable{
    
    private String strasse;
    private String hausnummer;
    private String plz;
    private String stadt;
    
    public Anschrift(String strasse, String hausnummer, String plz, String stadt){
        
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
        
    }

    /**
     * @return the Strasse
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * @param strasse the Strasse to set
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * @return the Hausnummer
     */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * @param hausnummer the Hausnummer to set
     */
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
     * @return the plz
     */
    public String getPlz() {
        return plz;
    }

    /**
     * @param plz the plz to set
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     * @return the stadt
     */
    public String getStadt() {
        return stadt;
    }

    /**
     * @param stadt the stadt to set
     */
    public void setStadt(String stadt) {
        this.stadt = stadt;
    }
    
}
