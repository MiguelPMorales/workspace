package workstuff;

public class Hero {
	private String name;
	private String power;
	private int age;
	private int hp;
	private int dmgPerHit;
	
	public Hero() {
		name = "John Doe";
		power = "Can do taxes 10 minutes faster";
		age = 20;
		hp = 100;
		dmgPerHit = 10;
	}//end hero
	
	public Hero(String name, String power, int age, int hp, int dmgPerHit) {
		this.name = name;
		this.power = power;
		this.age = age;
		this.hp = hp;
		this.dmgPerHit = dmgPerHit;
	}//end hero
	
	public void setPower(String power) {
		this.power = power;
	}//end setPower
	
	public void setHealth(int hp) {
		this.hp = hp;
	}//end setHealth
	
	public int getHealth() {
		return hp;
	}//end getHealth
	
	public int getdmgPerHit(int dmgPerHit) {
		return dmgPerHit;
	}//end getdmgPerHit
	
	public void attack(Hero h) {
		h.setHealth(h.getHealth() - dmgPerHit);
		//h.hp = h.hp - dmgPerHit;
	}//end attack
	
	@Override
	public String toString() {
		return "Name: " + name + " Power: " + power;
	}//end toString
}//end class
