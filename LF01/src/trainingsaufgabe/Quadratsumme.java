package trainingsaufgabe;

import java.io.IOException;

import oop.IO;

public class Quadratsumme {

	public static void main(String[] args) throws IOException {
		System.out.print("Geben sie bitte ihre Zahl ein:");
		int endeIndex = IO.readInteger();
		double summe =0 ;
		
		for (int i=0; i <= endeIndex; i++) {
			//System.out.println(i + "*" + i + " = " + i * i);
			summe += i*i ;
		}
		System.out.println("Das Ergebniss lautet "+summe);
	}

}
