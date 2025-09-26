package oop_figuras;

import javax.swing.JOptionPane;

import OOP.MinkuTante;

public class OIzveide {

	
static void izveidotObjektu() {
	int x, y, cPNr;
	double p, a;
	int izvele = JOptionPane.showOptionDialog(null,
			"Kura objektu veidot", "Izvele",JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE, 
			null, Figuras.objektuPogas, Figuras.objektuPogas[0]);
	
	if(izvele == -1)
		izvele = 0;
	switch(izvele){
	case 0:
		x = MinkuTante.skaitlaParbaude(
				"Ievadi centra punkta x koordinates", -100,100);
		y = MinkuTante.skaitlaParbaude(
				"Ievadi centra punkta y koordinates", -100,100);
		//Izveidot centra punkta objektu un ielikt dinamiskaja masiva
		Figuras.centraObjekti.add(new Centrs(x, y));
		
		break;
	case 1:
		String[] ceIzvelesVeids = {"Noklusejuma", "Centra punkts un malas"};
		
		String veids = (String)JOptionPane.showInputDialog(null,
				"Īzvelies, kurur konstrukturu izsaukt", "Cetrstura izveide", JOptionPane.QUESTION_MESSAGE,
				null, ceIzvelesVeids, ceIzvelesVeids[0]);
		
		
		if(veids == null)
			veids = ceIzvelesVeids[0];
		switch(veids) {
		case  "Noklusejuma":
			Figuras.cetrsturaObjekti.add(new Cetrsturis());
			break;
		case"Čentra punkts un malas":
			cPNr = 0;
			p = MinkuTante.skaitlaParbaude("Ievadi cetrstura platumu", 1, 100);
					a = MinkuTante.skaitlaParbaude("Ievadi cetrstura augtumu", 1, 100);
					Figuras.cetrsturaObjekti.add(new Cetrsturis(
							Figuras.centraObjekti.get(cPNr), p, a));
			break;
		}
		break;
		
	case 4:
		JOptionPane.showMessageDialog(null, "Atgrizas uz galveno izvelni!","Pazinojums",
				JOptionPane.INFORMATION_MESSAGE);
		break;
		
	}
}
}
