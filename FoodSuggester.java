import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//usernames and database?
// next: write reading in files so i have data to work with and then write suggest

public class FoodSuggester {
    ArrayList<Recipe> recipes;
    ArrayList<Ingredient> ingredients;

    public FoodSuggester(File recipesFile, File ingredientsFile){

    }

    public boolean addRecipe(String recipeName, String... ingredients){
        if (recipeAlreadyExists(recipeName.toLowerCase())){
            System.out.println("Recipe with that name already exists.");
            return false;
        }
        Recipe newRecipe = new Recipe(recipeName.toLowerCase(), ingredients);
        this.recipes.add(newRecipe);
        return true;
    }

    public boolean addIngredient(String ingredientName, Recipe... recipes){
        if (ingredientAlreadyExists(ingredientName.toLowerCase())){
            System.out.println("Ingredient with that name already exists.");
            return false;
        }
        Ingredient newIngredient = new Ingredient(ingredientName.toLowerCase(), recipes);
        this.ingredients.add(newIngredient);
        return true;
    }

    public static String[] suggest(Ingredient[] myFood){
        //do percent match at some point?

    }

    private boolean recipeAlreadyExists(String recipeName){
        for (Recipe recipe : this.recipes){
            if (recipe.getName() == recipeName){
                return true;
            }
        }
        return false;
    }

    private boolean ingredientAlreadyExists(String ingredientName){
        for (Ingredient ingredient : this.ingredients){
            if (ingredient.getName() == ingredientName){
                return true;
            }
        }
        return false;
    }

    private void readInRecipes(File recipesFile){
        try{
            FileReader fr = new FileReader(recipesFile);
            BufferedReader br = new BufferedReader(fr);

        }catch(FileNotFoundException e){
            System.err.println("Recipe file could not be found.");
            System.exit(1);
        }

    }
}
