package oop_figuras;

public class Centrs {
//Atributi
	public int x,y;
	
	
	//Konstruktors
	public Centrs (int x, int y) {
		this.x = x;
		this.y= y;
	}			

	//Metodes
	public String izvaditKoordinatas() {
		return "Centra punkts atrodas :\nx = "+x+"\ny = "+y;
	}
	public void parvietot(int koordX, int koordY) {
		x += koordX;
		y += koordY;
	}
}
