import java.io.IOException;

import oop.IO;

public class Lagebestand {

	public static void main(String[] args) throws IOException {
	
		System.err.println("Wie viele Artikeln haben Sie im Lager? ");
		int anzahl = IO.readInteger();
		
		String [] artikelName = new String[anzahl];
		int [] artikelMenge = new int[anzahl];
		double [] artikelPreis = new double[anzahl];
	
		
		System.out.println("Erfassen Sie die einzelne Artikelbezeichnungen: ");
	
		for (int i=0 ; i < artikelName.length;i++) {
			System.out.print("Artikel "+(i+1) + ": ");
			artikelName[i] = IO.readString();
		}
		
		System.out.println("Erfassen Sie den einzelPreis jedes Artiekls: ");
		
		for (int i=0 ; i < artikelPreis.length;i++) {
			System.out.print(artikelName[i]+ ": ");
			artikelPreis[i] = IO.readDouble();
		}
		System.out.println("Erfassen Sie die Anzahl jedes Artiekls: ");

		for (int i=0 ; i < artikelMenge.length;i++) {
			System.out.print("artikelMenge[i] " + ": ");
			artikelMenge[i] = IO.readInteger();
	}
		// Ausrechnen
		 int gesamtmenge =0;
		 double gesamtpreis =0;
		for (int i=0;i<artikelMenge.length;i++) {
			gesamtmenge = gesamtmenge + artikelMenge [i];
			gesamtpreis=gesamtpreis+(artikelMenge[i]*artikelPreis[i]);
			
		}
		System.out.println("In Ihrem Lager befinden sich insgesamt "+gesamtmenge+ " im Wert von "+gesamtpreis+ " €");
		
}
}
