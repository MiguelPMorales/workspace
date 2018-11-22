package workstuff;

public class HeroTest {

	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		Hero h2 = new Hero("Supper Man","Making Good Food",34, 150, 12);
		Hero h3 = new Hero("Ronald","Owning McDonalds", 149, 200, 20);
		
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
		
		Meteorite m = new Meteorite();
		m.mutate(h1);
		m.mutate(h2);
		
		while(h1.getHealth() > 0) {
			h2.attack(h1);
			System.out.println("Hero 1 health: " + h1.getHealth());
		}//end while
				

	}//end main

}
