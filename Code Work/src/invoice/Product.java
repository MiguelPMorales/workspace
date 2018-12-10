package invoice;

public class Product {

	private String name; //name of product
	private double price; //price of product
	
	/**
	 * constructor for Product to set default values
	 */
	public Product() { //sets default values of the Product method
		name = "";
		price = 0;
	}//end constructor default
	
	/**
	 * constructor to provide variables with values using parameter values
	 * @param name - name of product
	 * @param price - price of product
	 */
	public Product(String name, double price) { //sets values of each variable using the given parameters
		this.name = name;
		this.price = price;
	}//end constructor
	
	/**
	 * prints out the price of the product
	 * @return - value of price
	 */
	public double getPrice() { //returns the value of the variable price
		return price;
	}
	
	/**
	 * prints out product information
	 */
	public String toString() { //returns the value of every variable
		return ("Product: " + name + " Price: " + price);
	}//end toString
}
