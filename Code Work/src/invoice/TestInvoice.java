package invoice;

public class TestInvoice {

	/**
	 * runs the invoice method
	 * @param c - the customer
	 * @param i - the customer's invoice
	 */
	public static void runInvoice(Customer c, Invoice i) { //prints out the customer's invoice
		i.printInvoice(); //runs printInvoice (from the Invoice method) 

		if(c.getFunds()- i.amountDue() < 0) { //if customer's funds is less than the total price of their order continue
			System.out.println("Evil villian credit union to the rescue!!");	
			c.addFunds(i.amountDue() - c.getFunds()); //adds the money difference to the customer's funds so that they can have their order approved 
			System.out.println("New funds total: " + c.getFunds()); //prints out the new amount of funds that they have
		}
		
		i.printInvoice(); //runs printInvoice again to show that the customer can now buy whatever they ordered
	}//end runInvoice

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create 3 additional invoice runs
				// add at least 5 items to invoice order for each invoice run
		// make sure in at least one of the runs the customer can not afford the purchase
				
				//invoice run 1
				Customer c = new Customer("island", "Dr evil", 1230.0); //creates a new customer using provided info
				Invoice in = new Invoice(c); //creates a new invoice for the customer
				in.addToOrder(new Product("flame Thower", 123.80), 3); //adds the product to the customer's order
				in.addToOrder(new Product("sharks", 105.2), 2); 
				in.addToOrder(new Product("lasers", 50.5), 20);
				
				runInvoice(c,in); //runs invoice
				System.out.println("");
				
				//invoice run 2
				Customer c1 = new Customer("Philippines", "Miguel",10000.0);
				Invoice MO = new Invoice(c1);
				MO.addToOrder(new Product("Bulletproof Paint",540.49), 10);
				MO.addToOrder(new Product("Free Real Estate",0.01), 1);
				
				runInvoice(c1,MO);
				System.out.println("");
				
				//invoice run 3
				Customer c2 = new Customer("Some Island", "Francis", 10.0);
				Invoice FO = new Invoice(c2);
				FO.addToOrder(new Product("Shoes", 500.0), 1000);
				FO.addToOrder(new Product("Something At Coco", 12.99), 5);
				
				runInvoice(c2,FO);
				System.out.println("");
				
				//invoice run 4
				Customer c3 = new Customer("Canada", "Evil Beavers", 0);
				Invoice BO = new Invoice (c3);
				BO.addToOrder(new Product("Unprocessed Logs", 50.0), 30);
				BO.addToOrder(new Product("Dental Insurance", 10000.99), 1);
				BO.addToOrder(new Product("Land", 1.99), 100);
				
				runInvoice(c3,BO);
				System.out.println("");
	}//end main

}
