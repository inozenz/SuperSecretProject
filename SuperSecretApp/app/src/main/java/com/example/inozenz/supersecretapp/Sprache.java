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
public class Sprache implements Serializable{
    
    private String sprache;
    private String level;
    
    public Sprache(String sprache, String level){
        
        this.sprache = sprache;
        this.level = level;
        
    }

    /**
     * @return the sprache
     */
    public String getSprache() {
        return sprache;
    }

    /**
     * @param sprache the sprache to set
     */
    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }
    
}
