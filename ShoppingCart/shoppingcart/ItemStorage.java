package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ItemStorage extends Storage <Item> {



	    public void addItemArtNumber(){

	        for(Item item : itemList) {
	            System.out.println("Enter: "+ itemList.lastIndexOf(item) +") to add "
	            		+ item.getDescription() + " to cart.\n");

	        }

	    }
}