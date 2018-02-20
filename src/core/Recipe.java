package core;

import java.util.List;

public class Recipe {

    private List<Ingredient> ingredients;
    private String instructions;

    public Recipe(List<Ingredient> ingredients, String instructions){
        this.ingredients = ingredients;
        this.instructions = instructions;
    }


}
