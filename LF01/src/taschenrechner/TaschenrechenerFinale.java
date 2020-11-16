package taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechenerFinale {

	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		boolean weiter = false;

		do {
			schreibeMenue();
			String auswahl = bufferedReader.readLine();


			if (auswahl.equals("+")) {
				addiereMenue();
			} else if (auswahl.equals("-")) {
				differenzMenue();

			} else if (auswahl.equals("*")) {
				multiplizirenMenue();

			} else if (auswahl.equals("/")) {
				divisionMenue();

			} else if (auswahl.equals("p")) {
				potenzierenMenue();

			} else if (auswahl.equals("w")) {
				wuerzelziehenMenue();

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

	private static void addiereMenue() throws NumberFormatException, IOException {
		System.out.print("Bitte geben Sie den ersten Summanden ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie den zweiten Summanden ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double summe = zahl1 + zahl2;
		System.out.println("Die Summe betr�gt " + summe);
	}

	private static void differenzMenue() throws NumberFormatException, IOException {
		System.out.print("Bitte geben Sie den Minuend ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie den Subtrahend ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double differenz = zahl1 - zahl2;
		System.out.println("Die Differenz betr�gt " + differenz);
	}

	private static void multiplizirenMenue() throws NumberFormatException, IOException {
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double multiplikation = zahl1*zahl2;
		System.out.println("Die Multiplikation betr�gt " + multiplikation);
	}

	private static void divisionMenue() throws NumberFormatException, IOException {	
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double division = zahl1/zahl2;
		System.out.println("Die division betr�gt " + division);
	}

	private static void potenzierenMenue() throws NumberFormatException, IOException {	
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double pot=Math.pow(zahl1,zahl2);
		System.out.println("Das Potenzieren betr�gt " + pot);
	}

	private static void wuerzelziehenMenue() throws NumberFormatException, IOException {	
		System.out.println(" Bitte Geben Sie die Zahl ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double wuerzel= Math.sqrt(zahl1);
		System.out.println("Die division betr�gt " + wuerzel);
	}




	private static void schreibeMenue() {
		System.out.println("Folgende Rechenarten stehen zur Verf�gung:");
		System.out.println("[+] f�r Addition");
		System.out.println("[-] f�r Subtraktion");
		System.out.println("[*] f�r Multiplikation");
		System.out.println("[/] f�r Division");
		System.out.println("[p] f�r Potenzieren");
		System.out.println("[w] f�r Wuerzelziehen");
		System.out.println();
	}

}
