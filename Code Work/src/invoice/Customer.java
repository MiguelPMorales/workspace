package invoice;

public class Customer {

	private String evilLairLocation; //Customer's lair location
	private String name; //Name of customer
	private double evilFunds; //Amt of money customer has
	
	/**
	 * Constructor for a customer
	 */
	public Customer() { //sets blank values for the Customer method
		evilLairLocation = "";
		name = "";
		evilFunds = 0;
	}//end constructor default
	
	/**
	 * Constructor for customer
	 * @param evilLairLocation - lair location of customer
	 * @param name - name of customer
	 * @param evilFunds - amount of money customer has
	 */
	public Customer(String evilLairLocation, String name, double evilFunds) { //fills variables with values from the parameters
		this.evilLairLocation = evilLairLocation;
		this.name = name;
		this.evilFunds = evilFunds;
	}//end constructor
	
	/**
	 * adds funds to evilFunds
	 * @param amt - amount being added to evilFunds
	 */
	public void addFunds(double amt) { //adds money to evilFunds using the value given by the parameter
		this.evilFunds = this.evilFunds + amt;
	}//end addFunds
	
	/**
	 * shows the amount of money the customer has
	 * @return - value of evilFunds
	 */
	public double getFunds() { //returns value of evilFunds
		return evilFunds;
	}//end getFunds
	 
	/**
	 * prints out the customer's information
	 */
	public String toString() { //returns the values of all variables in the Customer method
		return ("Location: " + evilLairLocation + " Name: " + name + " Money: " + evilFunds); 
	}//end toString
}
