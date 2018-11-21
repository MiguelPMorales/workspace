package workstuff;

public class Hero {
	private String name;
	private String power;
	private int age;
	private int powerlevel;
	
	public Hero() {
		name = "John Doe";
		power = "Can do taxes 10 minutes faster";
		age = 20;
		powerlevel = 9001;
	}//end hero
	
	public Hero(String name, String power, int age, int powerlevel) {
		this.name = name;
		this.power = power;
		this.age = age;
		this.powerlevel = powerlevel;
	}//end hero
	
	public void setPower(String power) {
		this.power = power;
	}//end setPower
	
	@Override
	public String toString() {
		return "Name: " + name + " Power: " + power;
	}//end toString
}//end class
