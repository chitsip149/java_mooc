/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.ArrayList;

public class BirdRecord {
    private ArrayList<Bird> birds;
    
    public BirdRecord(){
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird){
        this.birds.add(0, bird);
    }
    
    public void observation(String name){
        for (Bird bird:birds){
            if (bird.getName().equals(name)){
                bird.setObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
    public void all(){
        for (Bird bird:birds){
            System.out.println(bird);
        }
    }
    
    public void one(String name){
        for (Bird bird:birds){
            if (bird.getName().equals(name)){
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}
