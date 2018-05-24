package shoppingcart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class Program {

	public static void main(String[] args) throws IOException {

		ShoppingCart cart = new ShoppingCart();
		ItemStorage item = new ItemStorage();
		item.initItems();

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("1. Add to cart");
			System.out.println("2. Remove from cart");
			System.out.println("3. Show cart");
			System.out.println("4. Checkout");
			System.out.println("5. Search cart");
			System.out.println("6. Exit");


			switch (input.readLine()) {

			case "1":
				try {
					item.listOfItems();
					item.addItemArtNumber();
					int index = Integer.parseInt(input.readLine());
					cart.addItem(item.addRemove(index));
				} catch (NumberFormatException | IndexOutOfBoundsException e) {
					System.out.println("Invalid input. Numbers only!");
				}
				break;
			case "2":
				try {
					if (!cart.isEmpty()) {
						cart.listOfItems();
                        cart.removeItem();
                        int index = Integer.parseInt(input.readLine());
                        item.addItem(cart.addRemove(index));
						
						
						
					} else {
						System.out.println("Empty");
					}
				} catch (NumberFormatException | IndexOutOfBoundsException e) {

					System.out.println("Invalid input. Numbers only!");
				}
				break;
			case "3":
				cart.displayCart();
				break;
			case "4":
				cart.checkOut();
				break;
			case "5":

				break;
			case "6":
				System.exit(0);
			}
		}
	}

}
