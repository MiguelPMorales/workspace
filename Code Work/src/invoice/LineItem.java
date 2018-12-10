package invoice;

public class LineItem {

	private int qty; //amount of product being bought
	private Product theProduct; //the product being bought
	
	/**
	 * Constructor for LineItem, provides it with default values
	 */
	public LineItem() { //sets default values for the LineItem method
		qty = 0;
	}//end constructor default
	
	/**
	 * Constructor for LineItem, fills variables with parameter values
	 * @param qty - Quantity of product being bought
	 * @param theProduct - Product being bought
	 */
	public LineItem(int qty, Product theProduct) { //sets values of the variables using the values of the given parameters
		this.qty = qty;
		this.theProduct = theProduct;
	}//end constructor
	
	/**
	 * Prints out the amount of the product being bought
	 * @return - value of qty
	 */
	public int getQty() { //returns the qty of the product being bought
		return qty;
	}//end getQty
	
	/**
	 * Prints out the product being bought
	 * @return - product being bought
	 */
	public Product getProduct() { //returns the product and its information
		return theProduct;
	}//end getProduct
	
	/**
	 * Prints out product info + how much of it is being bought
	 */
	public String toString() { //returns the values of all variables in the LineItem method
		return ("Quantity: " + qty + " " + theProduct); 
	}//end toString
}
