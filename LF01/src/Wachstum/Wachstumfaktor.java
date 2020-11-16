package Wachstum;

import java.io.IOException;

import oop.IO;

public class Wachstumfaktor {

	public static void main(String[] args) throws IOException {
		
		//Eingabe in der Console
		do {
		
		System.out.println("Bitte die aktuelle Zellmenge eingeben:" );
		double zellmenge = IO.readDouble();
		System.out.println("Bitte den Wachstumsfaktor eingeben:" );
		double wachstumsfaktor = IO.readDouble();
		System.out.println("Bitte die Laufzeit der Hochrechnung in Tagen eingeben:" );
		double laufzeit = IO.readDouble();
		System.out.println("Tage      Zellmenge");
		
		//Verarbeitung in der Console
		
		for (int i=0 ; i <= laufzeit ; i++) {
		
		double formel = zellmenge* Math.pow(wachstumsfaktor, i);
		System.out.println(i+ "         " + formel);
		}
		
		//Ausgabe in der Console
		
		System.out.println("Soll die Berechung wiederholt werden?");
		
		
		}	
		while (IO.readBoolean());
		System.out.println("Thanks,Ma man");
		}
}
	


