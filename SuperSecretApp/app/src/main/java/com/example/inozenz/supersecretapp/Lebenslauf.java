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
public class Lebenslauf implements Serializable{

    
    private PersoenlicheDaten pDaten;
    private BeruflicheLaufbahn bLaufbahn;
    private SchulischeLaufbahn sLaufbahn;
    private KenntnisseUndFaehigkeiten kFaehigkeiten;
    
    public Lebenslauf(PersoenlicheDaten pDaten, BeruflicheLaufbahn bLaufbahn, SchulischeLaufbahn sLaufbahn, KenntnisseUndFaehigkeiten kFaehigkeiten){
        
        this.pDaten = pDaten;
        this.bLaufbahn = bLaufbahn;
        this.sLaufbahn = sLaufbahn;
        this.kFaehigkeiten = kFaehigkeiten;
    }

    public Lebenslauf(){

    }



    /**
     * @return the pDaten
     */
    public PersoenlicheDaten getpDaten() {
        return pDaten;
    }

    /**
     * @param pDaten the pDaten to set
     */
    public void setpDaten(PersoenlicheDaten pDaten) {
        this.pDaten = pDaten;
    }

    /**
     * @return the bLaufbahn
     */
    public BeruflicheLaufbahn getbLaufbahn() {
        return bLaufbahn;
    }

    /**
     * @param bLaufbahn the bLaufbahn to set
     */
    public void setbLaufbahn(BeruflicheLaufbahn bLaufbahn) {
        this.bLaufbahn = bLaufbahn;
    }

    /**
     * @return the ausbildung
     */
    public SchulischeLaufbahn getAusbildung() {
        return sLaufbahn;
    }

    /**
     * @param ausbildung the ausbildung to set
     */
    public void setAusbildung(SchulischeLaufbahn sLaufbahn) {
        this.sLaufbahn = sLaufbahn;
    }

    /**
     * @return the kFaehigkeiten
     */
    public KenntnisseUndFaehigkeiten getkFaehigkeiten() {
        return kFaehigkeiten;
    }

    /**
     * @param kFaehigkeiten the kFaehigkeiten to set
     */
    public void setkFaehigkeiten(KenntnisseUndFaehigkeiten kFaehigkeiten) {
        this.kFaehigkeiten = kFaehigkeiten;
    }
    
}
