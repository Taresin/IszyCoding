package izzieprojects.recipes;

public class Recipes {
    public static void main(String[] args) {
        Categories categories = new Categories();

        Recipe pork = new Recipe();
        pork.recipeTitle = "Pork";
        pork.ingredient = "Pig";
        pork.ingredientAmt = 10;

        categories.Dinner.add(pork);

        Recipe rabbit = new Recipe("Rabbit", 10, "Bunny");

        //create a list of recipes; in while loop, while i< 10, add recipes to list. end of loop print out all recipes


    }
}
