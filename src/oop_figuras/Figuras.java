package oop_figuras;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import OOP.MinkuTante;

public class Figuras {
	static String[] objektuPogas = {"Centrs", "Četrstūris", "Aplis", "Trijstūris", "Atgriezties"};
	static ArrayList<Centrs> centraObjekti = new ArrayList<>();
 static ArrayList<Cetrsturis> cetrsturaObjekti = new ArrayList<>();
	static ArrayList<Aplis> aplaObjekti = new ArrayList<>();
	static ArrayList<Tristuris> trijsturaObjekti = new ArrayList<>();
	public static void main(String[] args) {
		//izveido centrs objektu

		/* Centrs centraP1 = new Centrs(-10, 12);
System.out.println(centraP1.izvaditKoordinatas());
centraP1.parvietot(5, -2);
System.out.println(centraP1.izvaditKoordinatas());

//izveido cetrsturis objektu
Cetrsturis cetrsturis1 = new Cetrsturis();
System.out.println(cetrsturis1.izvaditCetursturaInfo());
//izvadit ssi cetrstura atrasanas vietu
System.out.println(cetrsturis1.punkts.izvaditKoordinatas());


Cetrsturis cetrsturis2 = new Cetrsturis(centraP1, 5, 11);
System.out.println(cetrsturis2.izvaditCetursturaInfo()+"/n"+
cetrsturis2.punkts.izvaditKoordinatas()+
"\ns = "+cetrsturis2.cLaukums());

Centrs punkts2 = new Centrs (5, 23);
Aplis aplis1 = new Aplis(punkts2, 5);
System.out.println(aplis1.izvaditApliInfo()+"\n"+"s = "+
aplis1.rLaukums()+"\n"+"c = "+
		aplis1.rLGarums());
*/
		

int izvele, poga;

do {
	izvele = MinkuTante.skaitlaParbaude(
			"Ko velies darit?\n"
			+ "0 - apturet\n"
			+ "1 - Izveidot objektu\n"
			+"2 - Aplukot objektus\n"
					+"3 - Izsaukt metodi",0, 3);
	if(izvele ==-1)
		izvele =0;
	
		switch(izvele) {
		case 1:
			OIzveide.izveidotObjektu();
			break;
		case 2:
			break;
		case 3:
			break;
		case 0:
			JOptionPane.showMessageDialog(null, "Programma aptureta!","Pazinojums",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
			
}while(izvele != 0);

	}

}
