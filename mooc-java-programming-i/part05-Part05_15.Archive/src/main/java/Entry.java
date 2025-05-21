/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Entry {
    private String identifier;
    private String name;
    public Entry(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public boolean equals (Object compared){
        Entry entryCompared = (Entry) compared;
        return (this.identifier.equals(entryCompared.getIdentifier()));
    }
    
    @Override 
    public String toString(){
        return this.identifier+": "+this.name;
    }
}
