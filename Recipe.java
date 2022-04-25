public class Recipe {
    private String name;
    private String[] ingredientsRequired;

    public Recipe(String name, String... ingredientNames){
        this.name = name;
        this.ingredientsRequired = ingredientNames;
    }

    public String getName(){
        return name;
    }
    
    public boolean ingredientsSuffice(Ingredient[] ingredients){
        for (String ingredientNeeded : ingredientsRequired){
            boolean hasIngredient = false;
            for (Ingredient ingredientHad : ingredients){
                if (ingredientHad.getName() == ingredientNeeded){
                    hasIngredient = true;
                    break;
                }
            }
            if (hasIngredient == false){
                return false;
            }
        }
        return true;
    }
}
