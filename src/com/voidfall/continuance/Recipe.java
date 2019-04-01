package com.voidfall.continuance;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Recipe
 */
public class Recipe {
    private Item yield;
    private HashMap<Item, Integer> cost;

    public Recipe(Item yield) {
        this.yield = yield;
        this.cost = new HashMap<>();
    }

    public void addCost(Item item, int number) {
        this.cost.put(item, number);
    }

    public Item getYield() {
        return this.yield;
    }
}