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
import java.util.Random;
public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
        
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        if (this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int rd = rand.nextInt(jokes.size());
        return this.jokes.get(rd);
    }
    
    public void printJokes(){
        for (String joke:jokes){
            System.out.println(joke);
        }
    }
}
