/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.inozenz.supersecretapp;

/**
 *
 * @author Inozenz
 */
public class LebenslaufOutputter {
    
    Lebenslauf lebenslauf;
    
    public LebenslaufOutputter(Lebenslauf lebenslauf){
        
        this.lebenslauf = lebenslauf;
        
    }
    
    public void print(){
        PersoenlicheDaten pDaten = lebenslauf.getpDaten();
        System.out.println(pDaten.getVorname()+" "+pDaten.getNachname());
        System.out.println(pDaten.getAnschrift().getStrasse() + " "+ pDaten.getAnschrift().getHausnummer());
        System.out.println(pDaten.getAnschrift().getPlz() + " " + pDaten.getAnschrift().getStadt());
        
    }
    
}
