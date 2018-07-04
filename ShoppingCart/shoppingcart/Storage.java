package shoppingcart;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Storage<T> {

	public List<T> itemList = new ArrayList<>();



	public void addItem(T item) {
		itemList.add(item);

	}


	
	public void removeItem(T item) {
		itemList.remove(item);
	}

}