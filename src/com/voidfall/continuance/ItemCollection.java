package com.voidfall.continuance;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ItemCollection
 */
public class ItemCollection {
    private ArrayList<Item> items;

    public ItemCollection() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public Iterator<Item> getItemIterator() {
        return this.items.iterator();
    }
}