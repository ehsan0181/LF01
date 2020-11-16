package taschenrechner;

public class TaschenrechnerOhneEingabe {

	public static void main(String[] args) {
		
		double x = 101;
		double y = 105;
		double summe= x+y;
		double multiplizieren= x*y;
		double division =x/y;
		double differenz = x-y ;

		// Ausgabe
		if(x>=0 && x<=100) {
			if (y>=0 && y<=100) {
				System.out.println("Summe = "+summe);
				System.out.println("Multipliezieren = "+multiplizieren);
				System.out.println("Divison = "+division);
				System.out.println("Differenz = "+ differenz);
			} else {
				System.out.println("Brechnung nicht möglich, da y nicht passend ist!");
			}
		} else {
			System.out.println("Brechnung nicht möglich, da x nicht passend ist!");
		}

	}

}
