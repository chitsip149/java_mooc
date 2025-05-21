/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Bird {
    private String name;
    private String latinName;
    private int observation;
    
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int observation(){
        return this.observation;
    }
    
    public void setObservation(){
        this.observation+=1;
    }
    
    @Override 
    public String toString(){
        return this.name + " ("+this.latinName+"): "+this.observation+" observations";
    }
}
