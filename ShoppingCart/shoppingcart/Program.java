package shoppingcart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class Program {

	public static void main(String[] args) throws IOException {

		ShoppingCart cart = new ShoppingCart();
		ItemStorage itemStorage = new ItemStorage();
		
		

	        String [] description = {"Ball", "Ring", "Hat"};
	        Double [] price = {10.00d, 20.00d, 30.00d};
	        
	        for (int i=0; i < description.length; i++) {
	            itemStorage.itemList.add(new Item(i+1, description[i], price[i]));
	        }
	       
	        
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("1. Add to cart");
			System.out.println("2. Remove from cart");
			System.out.println("3. Show cart");
			System.out.println("4. Checkout");
			System.out.println("5. Search storage");
			System.out.println("6. Exit");


			switch (input.readLine()) {

			case "1":
				try {
					itemStorage.listOfItems();
					itemStorage.addItemArtNumber();
					int artNumber = Integer.parseInt(input.readLine());
					cart.addItem(itemStorage.getItem(artNumber));
				} catch (NumberFormatException | IndexOutOfBoundsException e) {
					System.out.println("Invalid input. Numbers only!");
				}
				break;
			case "2":
				try {
					if (!cart.isEmpty()) {

                        cart.removeItem();
                        int artNumber = Integer.parseInt(input.readLine());
                        cart.removeItem(itemStorage.getItem(artNumber));

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
				String query = input.readLine();
				Item foundItem = itemStorage.getItem(query);
				
				if(foundItem == null) {
					try { 
					
					int queryInt = Integer.parseInt(query);
					foundItem = itemStorage.getItem(queryInt);
					}catch (Exception e){
						System.out.println("The item was not found");
					}
				}
				
				if (foundItem != null) {
				System.out.println("Found item: \n" + foundItem);
				
				}
				break;
			case "6":
				System.exit(0);
			}
		}
	}
	
}