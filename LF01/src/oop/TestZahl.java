package oop;

import java.io.IOException;

public class TestZahl {

	public static void main(String[] args) throws IOException {
		System.out.println("Bitte geben Sie eine Ganzzahl ein!");
		
		int Zahl= IO.readInteger();
		System.out.println(Zahl);
		System.out.println("Geben Sie Ihr Gewicht ein");
		double zahl = IO.readDouble();
		System.out.println("Sie sind "+zahl+ "Kg");
		System.out.println("Soll das Programm wiedrholt werden?");
		boolean frage = IO.readBoolean();
		System.out.println("Vielen Dank!" + frage);

		System.out.println("Gefällt es Dir in unserer Schule");
		boolean ok = IO.readBoolean();
		if (ok == true) {
			System.out.println("Das freut mich");
		} else if (ok == false) {
			System.out.println("Dascha blöööd");
		}

	}





}
