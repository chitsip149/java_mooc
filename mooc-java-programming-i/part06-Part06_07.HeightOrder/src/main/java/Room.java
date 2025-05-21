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
public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add (Person person){
        people.add(person);
    }
    
    public boolean isEmpty(){
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if (this.people.isEmpty()){
            return null;
        }
        int m=people.get(0).getHeight();
        Person ret = people.get(0);
        for (Person person:people){
            if (m>person.getHeight()){
                m=person.getHeight();
                ret = person;
            }
        }
        return ret;
    }
    
    public Person take(){
        Person ret = this.shortest();
        this.people.remove(ret);
        return ret;
    }
    
}
