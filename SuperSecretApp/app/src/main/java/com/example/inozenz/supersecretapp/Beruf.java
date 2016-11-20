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
public class Beruf implements Serializable{
    
    private String von;
    private String bis;
    private String firma;
    private String position;
    private String beschreibung;
    
    
    public Beruf(String von, String bis, String firma, String position,String beschreibung){
        this.von = von;
        this.bis = bis;
        this.firma = firma;
        this.position = position;
        this.beschreibung = beschreibung;
       
    }


    /**
     * @return the von
     */
    public String getVon() {
        return von;
    }

    /**
     * @param von the von to set
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * @return the bis
     */
    public String getBis() {
        return bis;
    }

    /**
     * @param bis the bis to set
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * @return the firma
     */
    public String getFirma() {
        return firma;
    }

    /**
     * @param firma the firma to set
     */
    public void setFirma(String firma) {
        this.firma = firma;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the beschreibung
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * @param beschreibung the beschreibung to set
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
    
}
