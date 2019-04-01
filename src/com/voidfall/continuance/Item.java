package com.voidfall.continuance;

/**
 * Item
 */
public class Item {
    private String name;
    private String description;

    public Item(String name, String description) {
        this.setName(name);
        this.setDescription(description);
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

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    private void setDescription(String description) {
        this.description = description;
    }
}