package invoice;
import java.util.ArrayList;
public class Invoice {

	Customer theCustomer; //Variable using the Customer method
	ArrayList<LineItem> items = new ArrayList<>(); //ArrayList to hold the items being bought + their quantities
	
	/**
	 * Constructor for customer Invoice
	 * @param theCustomer - the customer for which the invoice is meant for
	 */
	public Invoice(Customer theCustomer) { //fills theCustomer variable with parameter values 
		this.theCustomer = theCustomer;
	}//end constructor default
	
	/**
	 * adds a desired product to the customer's order
	 * @param product - product being added to the order
	 * @param qty - amount of the product that customer wants to buy
	 */
	public void addToOrder(Product product, int qty) { //adds an item to the ArrayList 
		items.add(new LineItem(qty, product));
	}//end addToOrder
	
	/**
	 * prints out the total price of the customer's order + if they can buy it with their current funds or not
	 */
	public void printInvoice() { //prints total price of all items in the ArrayList & prints out whether or not the customer can buy the current order or not
		System.out.println("Products:");
		for(int i = 0; i < items.size(); i++) { //prints out each item, the quantity being bought and its individual price, along with the total price (rounded down to first two decimal places)
			System.out.printf(items.get(i) + " Total: $%.2f" , (items.get(i).getProduct().getPrice() * items.get(i).getQty()));
			System.out.println("");
		}//end for
		if(amountDue() <= theCustomer.getFunds()) { //if customer's funds is greater than or equal to the total price continue
			System.out.println("ORDER APPROVED!"); 
		}//end if
		
		else {
			double fundsDeficit = theCustomer.getFunds() - amountDue(); //calculates the difference in funds
			fundsDeficit = fundsDeficit * -1; //converts the negative number into a positive number
			System.out.printf("You cannot afford this order at this time. You are short by: $%.2f" , fundsDeficit); //prints out difference in funds (rounded down to first two decimal places)
			System.out.println("");
		}//end else
	}
	
	/**
	 * checks if the customer can afford their entire order
	 * @param theCustomer - customer and their order
	 * @return - true if the customer can afford the order, false otherwise
	 */
	public boolean canAfford(Customer theCustomer) { //checks if the customer can buy all the items in the ArrayList
		
		if(amountDue() <= theCustomer.getFunds()) { //if customer's funds is greater than or equal to the total price continue
			return true;
		}
		else { //if customer's funds are less than the total price continue
			return false;
		}
	}//end canAfford
	
	/**
	 * calculates the total price of the customer's order
	 * @return - total value of all items in customer's order
	 */
	public double amountDue() { //returns the total price of all the items in the ArrayList
		double totalPrice = 0;
		for(int i = 0; i < items.size(); i++) { //loop that multiplies the product price by the quantity being bought, and is added to the current value of totalPrice
			totalPrice = totalPrice + items.get(i).getProduct().getPrice() * items.get(i).getQty();
		}//end for
		
		return totalPrice;
	}//end amountDue
}
