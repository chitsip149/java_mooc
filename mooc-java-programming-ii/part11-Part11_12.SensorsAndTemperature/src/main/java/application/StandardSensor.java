/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author minht
 */
public class StandardSensor implements Sensor {
    private int num;
    public StandardSensor(int num){
        this.num=num;
    }
    public boolean isOn(){    // returns true if the sensor is on
        return true;
    }
    public void setOn(){      // sets the sensor on
        
    }
    public void setOff(){
        
    }// sets the sensor off
    public int read(){        // returns the value of the sensor if it's on
                       // if the sensor is not on throw a IllegalStateException
        return this.num;
    }
}
