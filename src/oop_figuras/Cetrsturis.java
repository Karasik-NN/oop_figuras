package oop_figuras;

public class Cetrsturis {
public double platums, augstums;
public Centrs punkts;

//Konstruktoru parslagosana
public Cetrsturis() {
	punkts = new Centrs(0, 0);
}

public Cetrsturis(Centrs punkts, double p, double a) {
	this.punkts = punkts;
	platums =p;
	augstums = a;
}



public String izvaditCetursturaInfo() {
	return "Platums: "+platums+"cm augstums: "+augstums+"cm";
	}

//Uztaisit metodi, kas aprekina laukumu un atgriz tikai rezultatu
public double cLaukums() {
	double s = platums * augstums;
	return s;
}

}
