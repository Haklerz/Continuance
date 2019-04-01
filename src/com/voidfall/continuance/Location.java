package com.voidfall.continuance;

/**
 * Location
 */
public class Location {
    private String description;
    private ItemCollection items;

    public Location(String description) {
        this.setDescription(description);
    }

    public void addItem(Item item) {
        this.items.addItem(item);
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