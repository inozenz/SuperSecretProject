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
public class Ausbildung implements Serializable{
    
    private String von;
    private String bis;
    private String ausbildungsOrt;
    private String abschluss;

    public Ausbildung(String von, String bis, String ausbildungsOrt, String abschluss){
        
        this.von = von;
        this.bis = bis;
        this.ausbildungsOrt = ausbildungsOrt;
        this.abschluss = abschluss;
        
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
     * @return the ausbildungsOrt
     */
    public String getAusbildungsOrt() {
        return ausbildungsOrt;
    }

    /**
     * @param ausbildungsOrt the ausbildungsOrt to set
     */
    public void setAusbildungsOrt(String ausbildungsOrt) {
        this.ausbildungsOrt = ausbildungsOrt;
    }

    /**
     * @return the abschluss
     */
    public String getAbschluss() {
        return abschluss;
    }

    /**
     * @param abschluss the abschluss to set
     */
    public void setAbschluss(String abschluss) {
        this.abschluss = abschluss;
    }
    
    
    
}
