package oop;

import java.io.IOException;

public class Aufgabe1 {

	public static void main(String[] args) throws IOException {


		System.out.println("Wie viele Zeile: ");
		int zeile=IO.readInteger();
		System.out.println("Wie viele Spalte: ");
		int spalte=IO.readInteger();
		int [][]zahl = new int [zeile][spalte];
		//Eingabe in der Console 
		for (int i=0;i<zahl.length;i++) {
			for(int j=0;j<zahl[i].length;j++) {
				System.out.println("Erfassen Sie die Zahlen ["+ i + "] und ["+ j +"]");
				zahl[i][j] = IO.readInteger();
			}
		}
		for (int i=0;i<zahl.length;i++) {
			for(int j=0;j<zahl[i].length;j++) {
				System.out.print(zahl[i][j]+"\t");
			}
			System.out.println();




	}
	





	}
	}
