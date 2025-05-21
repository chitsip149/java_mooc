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
import java.util.Collections;

public class GradeCollection {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    
    public GradeCollection(){
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public int gradeConverter(int point){
        if (point>=90) {
            return 5;
        }
        if (point>=80) {
            return 4;
        }
        if (point>=70){
            return 3;
        }
        if (point>=60){
            return 2;
        }
        if (point>=50){
            return 1;
        }
        return 0;
    }
    
    public void addGrade(int point){
//        System.out.println(points);
        if (point>=0 && point<=100) {
            int grade = this.gradeConverter(point);
            this.points.add(point);
            this.grades.add(grade);
        }
        
        
    }
    
    public double averagePoints(){
        double ret =0;
        for (int num:points){
            ret+=num;
        }
        return ret/this.points.size();
    }
    
    public double averagePassingPoints(){
        double ret =0;
        int cnt=0;
        for (int num:points){
            
            if (num>=50){
                ret+=num;
                cnt++;
            }
        }
        if (cnt==0){
            return -1;
        }
        return ret/cnt;
    }
    
    public double passPercentage(){
        int cnt=0;
        for (int num:points){
            
            if (num>=50){
                cnt++;
            }
        }
        double ret = 100.0*cnt/points.size();
        return ret;
    }
    
    public void printGradeDistribution(){
        System.out.println("Grade distribution:");
        for (int i=5; i>=0; i--){
            int cnt=0;
            for (int grade:grades){
                if (grade==i){
                    cnt++;
                }
            }
            System.out.print(i+": ");
            for (int j=0; j<cnt; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
