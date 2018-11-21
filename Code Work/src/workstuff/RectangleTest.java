package workstuff;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5,20,200,5);
		
		r2.translate(25, -25);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		
		

	}//end main

}
