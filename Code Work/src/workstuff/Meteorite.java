package workstuff;

public class Meteorite {
	String[] powers =  {"Extreme Smacking","Explosions","Doing Taxes","Baking"};
	
	public Meteorite() {
	}//end Meteorite
	
	public void mutate(Hero h) {
		int r = (int)(Math.random()* powers.length);
		String newPower = powers[r];
		h.setPower(newPower);
		System.out.println(h.toString());
	}//end mutate
	
}//end class
