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
	


}