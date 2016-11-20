/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inozenz.supersecretapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Inozenz
 */
public class KenntnisseUndFaehigkeiten implements Serializable{
    
    private ArrayList<Sprache> fremdSprachen;
    private String pcKenntnisse;
    private String fuehrerschein;


    public KenntnisseUndFaehigkeiten(ArrayList<Sprache> fremdSprachen, String pcKenntnisse, String fuehrerschein){

        this.fremdSprachen = fremdSprachen;
        this.pcKenntnisse = pcKenntnisse;
        this.fuehrerschein = fuehrerschein;

    }

    public ArrayList<Sprache> getFremdSprachen() {
        return fremdSprachen;
    }

    public void setFremdSprachen(ArrayList<Sprache> fremdSprachen) {
        this.fremdSprachen = fremdSprachen;
    }

    /**
     * @return the pcKenntnisse
     */
    public String getPcKenntnisse() {
        return pcKenntnisse;
    }

    /**
     * @param pcKenntnisse the pcKenntnisse to set
     */
    public void setPcKenntnisse(String pcKenntnisse) {
        this.pcKenntnisse = pcKenntnisse;
    }

    /**
     * @return the fuehrerschein
     */
    public String getFuehrerschein() {
        return fuehrerschein;
    }

    /**
     * @param fuehrerschein the fuehrerschein to set
     */
    public void setFuehrerschein(String fuehrerschein) {
        this.fuehrerschein = fuehrerschein;
    }
    
}
