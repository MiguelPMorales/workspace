package workstuff;

public class Rectangle {
//instance variables/attributes
	private int length;
	private int width;
	private int x;
	private int y;
	
//constructor
	public Rectangle() {
		x = 10;
		y = 10;
		length = 100;
		width = 50;
	}//end Rectangle
	
	public Rectangle(int x, int y, int length, int width) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}//end Rectangle
	
	public int getX() {
		return x;
	}//end getX
	
	public void setX( int x) {
		this.x = x;
	}//end setX
	
	public void translate(int xMove, int yMove) {
		x+= xMove;
		y+= yMove;
	}//end translate
	
	public String toString() {
		return "x: " + x + " y: " + y + " length: " + length + " width: " + width;
	}//end toString
}//end class
