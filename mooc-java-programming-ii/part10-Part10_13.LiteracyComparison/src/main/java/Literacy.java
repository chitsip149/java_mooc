/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
public class Literacy implements Comparable<Literacy> {
    String country;
    String gender;
    int year;
    double literacyRate;
    
    public Literacy(String country, int year, String gender, double literacyRate){
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }
    
    public double getLiteracyRate(){
        return this.literacyRate;
    }
    
    @Override
    public int compareTo(Literacy literacy){
        if (this.literacyRate==literacy.getLiteracyRate()){
            return 0;
        }
        if (this.literacyRate>literacy.getLiteracyRate()){
            return 1;
        }
        return -1;
    }
    
    @Override
    public String toString(){
        return this.country+" ("+this.year+"), "+this.gender+", "+this.literacyRate;
    }
    
    
}
