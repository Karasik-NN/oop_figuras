package oop_figuras;

public class Aplis {
public Centrs punkts;
public double radiuss;

public Aplis (Centrs p, double r) {
	punkts =p;
	radiuss =r;
}

public String izvaditApliInfo() {
	return "Radiuss: "+radiuss;
}

//izveidot metodi rinka linijas prrekinosana
public double rLGarums() {
	double c = 2*Math.PI*radiuss;
	return Math.round(c*100.0)/100.0;
}
//rinka laukuma aprekinosanai
public double rLaukums() {
	double s = Math.PI*Math.pow(radiuss, 2);
	return Math.round(s*100.0)/100.0;
}
}



