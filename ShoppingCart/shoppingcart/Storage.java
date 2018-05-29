package shoppingcart;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Storage<T> {

	public List<Item> itemList = new ArrayList<>();


	public void initItems() {

        String [] description = {"Ball", "Ring", "Hat"};
        Double [] price = {10.00d, 20.00d, 30.00d};
        
        for (int i=0; i < description.length; i++) {
            this.itemList.add(new Item(i+1, description[i], price[i]));
        }

	}
	


	public void listOfItems() {

		for (Item item : itemList) {
			System.out.println(item);

		}

	}

	public void addItem(Item item) {
		itemList.add(item);

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
	
	
	public void removeItem(int artNumber) {
		Item chosenItem = null;
		for (Item item : itemList) {
			if(artNumber == item.getArtNumber()) {
				
				chosenItem = item;
				break;
			}
		}
			itemList.remove(chosenItem);
	}

}