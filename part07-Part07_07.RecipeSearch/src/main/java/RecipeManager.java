
import java.util.ArrayList;


public class RecipeManager {
    
    private ArrayList<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void printRecipes() {
        for(Recipe r: this.recipes) {
            System.out.println(r.getName()+", cooking time: "+r.getCookingTime());
        }
    }
    
    public void searchByName(String word) {
        for(Recipe r: this.recipes) {
            if(r.getName().contains(word))
                System.out.println(r.toString());
        }
    }
    
    public void searchByCookingTime(int time) {
        for(Recipe r: this.recipes) {
            if(r.getCookingTime() <= time)
                System.out.println(r.toString());
        }
    }
    
    public void searchByIngredients(String ing) {
        for(Recipe r: this.recipes) {
            if(r.getIngredients().contains(ing))
                System.out.println(r.toString());
        }
    }
}
