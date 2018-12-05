package invoice;

public class Customer {

	private String evilLairLocation;
	private String name;
	private double evilFunds;
	
	public Customer() {
		evilLairLocation = "";
		name = "";
		evilFunds = 0;
	}//end constructor
	
	public Customer(String evilLairLocation, String name, double evilFunds) {
		this.evilLairLocation = evilLairLocation;
		this.name = name;
		this.evilFunds = evilFunds;
	}//end constructor
	
	public void addFunds(double amt) {
		this.evilFunds = this.evilFunds + amt;
	}//end addFunds
	 
	
	public String toString() {
		return ("Location: " + evilLairLocation + " Name: " + name + " Money: " + evilFunds); 
	}//end toString
}
