package taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerMiteingabe {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		boolean weiter = false;
		
		do {
			schreibeMenue();
			String auswahl = bufferedReader.readLine();
			
			if (auswahl.equals("+")) {
				System.out.print("Bitte geben Sie den ersten Summanden ein: ");
				double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
				System.out.print("Bitte geben Sie den zweiten Summanden ein: ");
				double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
				double summe = zahl1 + zahl2;
				System.out.println("Die Summe beträgt " + summe);
			} else if (auswahl.equals("-")) {
				System.out.print("Bitte geben Sie den Minuend ein: ");
				double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
				System.out.print("Bitte geben Sie den Subtrahend ein: ");
				double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
				double differenz = zahl1 - zahl2;
				System.out.println("Die Differenz beträgt " + differenz);
			}
			
			System.out.println();		
			System.out.println("Soll das Programm wiederholt werden?");
			String text = bufferedReader.readLine();
			if (text.equalsIgnoreCase("Ja")) {
				weiter = true;
			} else {
				weiter = false;
			
			}
		}while(weiter == true);
	}

	private static void schreibeMenue() {
		System.out.println("Folgende Rechenarten stehen zur Verfügung:");
		System.out.println("[+] für Addition");
		System.out.println("[-] für Subtraktion");
		System.out.println("[*] für Multiplikation");
		System.out.println("[/] für Division");
		System.out.println("[p] für Potenzieren");
		System.out.println("[w] für Wurzelziehen");
		System.out.println();
	}

}
