public class Ingredient{
    private String name;
    private Recipe[] recipes;

    public Ingredient(String name, Recipe[] recipes){
        this.name = name;
        this.recipes = recipes;
    }
    
    public String getName(){
        return name;
    }

    public Recipe[] getRecipes(){
        return recipes;
    }
}