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
import java.util.Random;
public class TemperatureSensor implements Sensor {
    private boolean sensor;
    public TemperatureSensor(){
        this.sensor = false;
    }
    public boolean isOn(){
        return this.sensor;
    }
    
    public void setOn(){
        this.sensor = true;
    }
    
    public void setOff(){
        this.sensor = false;
    }
    
    public int read(){
        int ran = new Random().nextInt(61);
        ran-=30;
        return ran;
    }
}
