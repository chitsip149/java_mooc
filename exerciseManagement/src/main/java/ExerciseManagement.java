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
public class ExerciseManagement {
    private ArrayList<String> exercises;
    private ArrayList<String> completedExercise;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
        this.completedExercise = new ArrayList<>();
    }
    public ArrayList<String> exerciseList(){
        return this.exercises;
    }
    public void add (String exercise){
        this.exercises.add(exercise);
    }
    
    public boolean contains(String exercise){
        return this.exercises.contains(exercise);
    }
    
    public void markAsCompleted(String exercise){
        this.completedExercise.add(exercise);
    }
    
    public boolean isCompleted(String exercise){
        return this.completedExercise.contains(exercise);
    }
}
