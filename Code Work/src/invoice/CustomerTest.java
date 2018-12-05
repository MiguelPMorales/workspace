package invoice;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c0 = new Customer();
		System.out.println(c0.toString());
		Customer c1 = new Customer("Alabama","Real Hillbilly",10.50);
		System.out.println(c1.toString());
		c1.addFunds(500.0);
		System.out.println(c1.toString());
		System.out.println("");
		
		Product p0 = new Product();
		System.out.println(p0.toString());
		Product p1 = new Product("Explosive Plumbing", 500.49);
		System.out.println(p1.toString());
		System.out.println("");
		
		LineItem l0 = new LineItem();
		System.out.println(l0.toString());
		LineItem l1 = new LineItem(10 ,new Product("Vegetables",5.50));
		System.out.println(l1.toString());
		
		
	}//end main

}
