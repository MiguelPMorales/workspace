package invoice;

public class Product {

	private String name;
	private double price;
	
	public Product() {
		name = "";
		price = 0;
	}//end constructor 
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}//end constructor
	
	public String toString() {
		return ("Product: " + name + " Price: " + price); 
	}//end toString
}
