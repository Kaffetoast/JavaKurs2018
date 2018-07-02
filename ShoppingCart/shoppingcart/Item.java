package shoppingcart;

public class Item {
    private Integer artNumber;
    private String description;
    private Double price;
    
    
    public Item (Integer artNumber, String description, Double price) {
        this.artNumber = artNumber;
        this.description = description;
        this.price = price;
    }


    public Integer getArtNumber() {
		return artNumber;
	}

	public void setArtNumber(Integer artNumber) {
		this.artNumber = artNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}



	@Override
	public String toString() {

		return "Article nr: " + artNumber + "\nPrice: " + price + "\nDescription: " + description;
	}



 
}