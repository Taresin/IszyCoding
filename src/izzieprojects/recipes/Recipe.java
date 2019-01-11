package izzieprojects.recipes;

public class Recipe {
    String recipeTitle;
    int ingredientAmt;
    String ingredient;

    public Recipe() {

    }

    public Recipe(String recipeTitle, int ingredientAmt, String ingredient) {
        this.recipeTitle = recipeTitle;
        this.ingredientAmt = ingredientAmt;
        this.ingredient = ingredient;
    }
}
