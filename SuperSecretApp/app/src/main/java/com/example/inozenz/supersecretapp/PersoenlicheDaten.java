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
public class PersoenlicheDaten implements Serializable{
    
    private String vorname;
    private String nachname;
    private Anschrift anschrift;
    private String telefon;
    private String eMail;
    private String geburtstag;

    public PersoenlicheDaten(String vorname, String nachname, Anschrift anschift, String telefon, String eMail, String geburtstag){
        
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschift;
        this.telefon = telefon;
        this.eMail = eMail;
        this.geburtstag = geburtstag;
        
        
        
    }
    /**
     * @return the vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * @param vorname the vorname to set
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * @return the nachname
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * @param nachname the nachname to set
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * @return the anschrift
     */
    public Anschrift getAnschrift() {
        return anschrift;
    }

    /**
     * @param anschrift the anschrift to set
     */
    public void setAnschrift(Anschrift anschrift) {
        this.anschrift = anschrift;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return the geburtstag
     */
    public String getGeburtstag() {
        return geburtstag;
    }

    /**
     * @param geburtstag the geburtstag to set
     */
    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }
    
}
