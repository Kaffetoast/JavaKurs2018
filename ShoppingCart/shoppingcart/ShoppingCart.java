package shoppingcart;

import java.text.NumberFormat;
import java.util.Locale;

public class ShoppingCart extends Storage<Item> {

	public void checkOut() {
		double TotalPrice = 0.0d;
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());

		nf.format(TotalPrice);

		for (Item item : itemList) {
			TotalPrice += item.getPrice();
		}
		System.out.println("Total: " + TotalPrice);
		System.out.println("Thanks for shopping!");
		itemList.clear();
	}

	public void displayCart() {

			System.out.println(itemList.toString());
			itemList.clear();


	}

    public boolean isEmpty() {
        return itemList.size() == 0;

    }
    

    public void removeItem(){

        for(Item item : itemList) {
            System.out.println("Enter: "+ itemList.lastIndexOf(item) +") to remove "
            		+ item.getDescription() + " from cart.\n");

        }
}
}
