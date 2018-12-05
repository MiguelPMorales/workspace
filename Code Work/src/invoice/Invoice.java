package invoice;
import java.util.ArrayList;
public class Invoice {

	Customer theCustomer;
	ArrayList<LineItem> items = new ArrayList<>();
	
	public Invoice(Customer theCustomer) {
		this.theCustomer = theCustomer;
	}//end constructor
	
	public void addToOrder(Product product, int qty) {
		
	}//end addToOrder
	
	public void printInvoice() {
		
	}//end printInvoice
	
	public boolean canAfford(Customer theCustomer) {
		return
	}//end canAfford
}
