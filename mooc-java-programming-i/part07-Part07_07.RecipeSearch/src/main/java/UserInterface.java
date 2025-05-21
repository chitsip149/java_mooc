/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author minht
 */
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private RecipeList list;
    
    public UserInterface(RecipeList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        System.out.println("File to read:");
        String file = this.scanner.nextLine();
        scanFile(file);
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");
        System.out.println("");
        implementCommands();
    }
    
    public void scanFile(String file){
        try (Scanner scanFile = new Scanner(Paths.get(file))){
            while (scanFile.hasNextLine()){
                String name = scanFile.nextLine();
                System.out.println(name);
//                if (name.isBlank()){
//                    break;
//                }
                int time = Integer.valueOf(scanFile.nextLine());
                System.out.println(time);
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanFile.hasNextLine()){
                    String ingredient = scanFile.nextLine();
                    if (ingredient.equals("")){
                        break;
                    }
                    ingredients.add(ingredient);
                }
                Recipe recipe = new Recipe(name, time, ingredients);
                this.list.addRecipe(recipe);
                
            }
            
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public void implementCommands(){
        while (true){
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("list")){
                this.list.listRecipe();
            } else if (command.equals("stop")){
                break;
            } else if (command.equals("find name")){
                System.out.println("Searched word:");
                String name = scanner.nextLine();
                this.list.findName(name);
            } else if (command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                this.list.findCookingTime(time);
            } else if (command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                this.list.findIngredient(ingredient);
            }
            System.out.println("");
        }
    }
}
