package shoppingcart;

import java.text.NumberFormat;
import java.util.Locale;

public class ShoppingCart extends Storage<Item> {

	public void checkOut() {

		if (itemList.isEmpty()) {
			System.out.println("Nothing to checkout");
		}

		else if (!itemList.isEmpty()) {
			double TotalPrice = 0.0d;
			NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());

			for (Item item : itemList) {
				TotalPrice += item.getPrice();
			}
			System.out.println("Total: " + nf.format(TotalPrice));
			System.out.println("Thanks for shopping!");
			itemList.clear();

		}
	}

	public void displayCart() {

		if (itemList.size() == 0) {
			System.out.println("Cart is Empty");
		}

		else if (!itemList.isEmpty()) {
			System.out.println(itemList.toString());
		}

	}

	public boolean isEmpty() {
		return itemList.size() == 0;

	}

	public void removeItem() {

		for (Item item : itemList) {
			System.out.println(
					"Enter: " + item.getArtNumber() + ") to remove " + item.getDescription() + " from cart.\n");

		}
	}
}
