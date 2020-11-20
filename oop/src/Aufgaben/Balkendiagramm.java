package Aufgaben;

import java.io.IOException;

import oop.IO;

public class Balkendiagramm {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Kandidaten sind noch am Rennen? ");
		int anzahl=IO.readInteger();
		double [] voting = new double [anzahl];
		System.out.println("Erfassen Sie jetzt die prozentuale des Votings: ");
		for (int i=0;i<voting.length;i++) {
			System.out.println("Kandidat "+(i+1) + ": ");
			
		}
		System.out.println("Ergebnis");
		for(int i=0;i<voting.length;i++) {
			System.out.println("Kandidat "+ (i+1)+": ");
			for(int j=0;j<voting[anzahl];j++) {
				System.out.println("*");
			}
			System.out.println(" "+voting[i]+ "%");
		}
		
		
		

	}

}
