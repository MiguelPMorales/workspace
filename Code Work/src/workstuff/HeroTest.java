package workstuff;

public class HeroTest {

	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		Hero h2 = new Hero("Supper Man","Making Good Food",34);
		Hero h3 = new Hero("Ronald","Owning McDonalds", 149);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Meteorite m = new Meteorite();
		m.mutate(h1);
		m.mutate(h2);
		

	}//end main

}
