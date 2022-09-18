
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private RecipeManager recipes;
    private String fileName;

    public UserInterface(Scanner scanner, RecipeManager recipes, String fileName) {
        this.scanner = scanner;
        this.recipes = recipes;
        this.fileName = fileName;
    }
    
    public void start() {
       this.readFiletoRecipe();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while(true) {
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop"))
                break;
            else if(command.equals("list")) {
                System.out.println("");
                System.out.println("Recipes:");
                this.recipes.printRecipes();
            } else if(command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                this.recipes.searchByName(word);
                
            } else if(command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                this.recipes.searchByCookingTime(time);
                
            } else if(command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ing = scanner.nextLine();
                System.out.println("Recipes:");
                this.recipes.searchByIngredients(ing);
                
            }
            
        }
    }
    
    public void readFiletoRecipe() {
        try (Scanner fileReader = new Scanner(Paths.get(this.fileName))) {
            while(true) {
                String name = fileReader.nextLine();
                int cookingTime = Integer.valueOf(fileReader.nextLine());
                ArrayList<String> ingred = new ArrayList<>();
                while(true) {
                    String ing = fileReader.nextLine();
                    if(ing.isEmpty() || !fileReader.hasNextLine())
                        break;
                    ingred.add(ing);
                }
                this.recipes.addRecipe(new Recipe(name, cookingTime, ingred));
                if(!fileReader.hasNextLine())
                	break;
            }
        } catch (Exception e) {
            //System.out.println("Error: " + e.getMessage());
        } 
    }
    
    
}
