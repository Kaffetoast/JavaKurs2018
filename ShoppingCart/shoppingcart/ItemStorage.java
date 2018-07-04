package shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemStorage extends Storage<Item> {

	public void addItemArtNumber() {

		for (Item item : itemList) {
			System.out.println(
					"Enter: " + item.getArtNumber() + ") to add " + item.getDescription() + " to cart.\n");

		}
		
	}
	

	public Item getItem(int artNumber) {
		for (Item item : itemList) {
			if(artNumber == item.getArtNumber()) {
				
				return item;
			}
		}

		return null;
	}
	
	public Item getItem(String description) {
		for (Item item : itemList) {
			
			
			if(item.getDescription().toLowerCase().trim().equals(description.toLowerCase().trim())) {
				
				return item;
			}
		}

		return null;
	}
	



	public void listOfItems() {

		for (Item item : itemList) {
			System.out.println(item);

		}

	}
	
}

