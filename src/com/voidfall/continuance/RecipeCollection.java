package com.voidfall.continuance;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * RecipeCollection
 */
public class RecipeCollection {
    private ArrayList<Recipe> recipes;

    public RecipeCollection() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public Iterator<Recipe> getRecipeIterator() {
        return this.recipes.iterator();
    }

	public Recipe getRecipe(String itemName) {
		return null;
	}
}