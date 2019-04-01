package com.voidfall.continuance;

import java.util.Iterator;

/**
 * Player
 */
public class Player {
    private String name;
    private ItemCollection items;

    public Player(String name) {
        this.setName(name);
        this.items = new ItemCollection();
    }

    public Item craft(String itemName, RecipeCollection recipes) {
        Recipe recipe = recipes.getRecipe(itemName);
        boolean craftable = false;
        Item craftedItem = null;
        for (Iterator<Item> costIterator = recipe.getCostIterator(); costIterator.hasNext();) {
        }
        return craftedItem;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    private void setName(String name) {
        this.name = name;
    }
}