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

public class RecipeList {
    private ArrayList<Recipe> list;
    
    public RecipeList(){
        this.list = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe){
        this.list.add(recipe);
    }
    
    public void listRecipe(){
        for (Recipe recipe:this.list){
            System.out.println(recipe);
        }
        
    }
    
    public void findName(String name){
        for (Recipe recipe:this.list){
            if (recipe.getName().contains(name)){
                System.out.println(recipe);
            }
        }
    }
    
    public void findCookingTime(int time){
        for (Recipe recipe:this.list){
            if (recipe.getTime()<=time){
                System.out.println(recipe);
            }
        }
    }
    
    public void findIngredient(String ingredient){
        for (Recipe recipe:this.list){
            if (recipe.getIngredients().contains(ingredient)){
                System.out.println(recipe);
            }
        }
    }
}
