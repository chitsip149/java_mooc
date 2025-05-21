/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Person {
    private String name;
    private Education education;
    
    public Person(String name, Education education){
        this.name = name;
        this.education = education;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Education getEducation(){
        return this.education;
    }
    
    @Override
    public String toString(){
//        String ret=this.name+", ";
        StringBuilder ret = new StringBuilder(this.name+", ");
        if (this.education == Education.PHD){
            ret.append("PHD");
        } else if (this.education == Education.MA){
            ret.append("MA");
        } else if (this.education == Education.BA){
            ret.append("BA");
        } else {
            ret.append("HS");
        }
        return ret.toString();
    }
}
