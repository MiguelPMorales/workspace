package invoice;

public class LineItem {

	private int qty;
	private
	Product theProduct;
	
	public LineItem() {
		qty = 0;
	}//end constructor
	
	public LineItem(int qty, Product theProduct) {
		this.qty = qty;
		this.theProduct = theProduct;
	}//end constructor
	
	public String toString() {
		return ("Quantity: " + qty + " Product: " + theProduct); 
	}//end toString
}
