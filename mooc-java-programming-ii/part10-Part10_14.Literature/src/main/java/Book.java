/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Book {
    String name;
    int age;
    
    public Book(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    @Override
    public String toString(){
        return this.name+" (recommended for "+this.age+" year-olds or older)";
    }
}
