/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

import java.util.Objects;

/**
 *
 * @author minht
 */

public class Airport {
    private String id;
    
    public Airport(String id){
        this.id = id;
    }
    
    public String getID(){
        return this.id;
    }
    
    
}
