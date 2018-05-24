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


	public Item addRemove(int artNumber) {

		Item item = itemList.get(artNumber);
		itemList.remove(artNumber);
		return item;

	}

}