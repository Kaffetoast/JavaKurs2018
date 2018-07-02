package shoppingcart;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Storage<T extends Item> {

	public List<T> itemList = new ArrayList<>();





	public void listOfItems() {

		for (T t : itemList) {
			System.out.println(t);

		}

	}

	public void addItem(T t) {
		itemList.add(t);

	}


	public T getItem(int artNumber) {
		for (T t : itemList) {
			if(artNumber == t.getArtNumber()) {
				
				return t;
			}
		}

		return null;
	}
	
	public T getItem(String description) {
		for (T t : itemList) {
			
			
			if(t.getDescription().toLowerCase().trim().equals(description.toLowerCase().trim())) {
				
				return t;
			}
		}

		return null;
	}
	
	
	public void removeItem(int artNumber) {
		T chosenItem = null;
		for (T t : itemList) {
			if(artNumber == t.getArtNumber()) {
				
				chosenItem = t;
				break;
			}
		}
			itemList.remove(chosenItem);
	}

}