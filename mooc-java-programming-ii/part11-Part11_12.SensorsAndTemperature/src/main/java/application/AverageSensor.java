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
import java.util.ArrayList;
import java.util.List;
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public boolean isOn(){
        for (Sensor sensor:this.sensors){
            if (!sensor.isOn()){
                return false;
            }
        }
        return true;
    }
    
    public void setOn(){
        for (Sensor sensor:this.sensors){
            sensor.setOn();
        }
    }
    
    public void setOff(){
        for (Sensor sensor:this.sensors){
            sensor.setOff();
        }
    }
    
    public int read(){
        if (this.sensors.isEmpty() || !this.isOn()){
            throw new IllegalStateException("Illegal state.");
        }
        int sum=0;
//        int cnt=0;
        for (Sensor sensor:this.sensors){
            sum+=sensor.read();
        }
        this.readings.add(sum/this.sensors.size());
        return sum/this.sensors.size();
        
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
