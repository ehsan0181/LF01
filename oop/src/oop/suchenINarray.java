package oop;

import java.io.IOException;

public class suchenINarray {

	public static void main(String[] args) throws IOException {
		System.out.println("Bitte Geben Sie ein Array bestehend aus 5 Kommazahlen ein.");
		double [] Zahl= IOklasse.readDoubleArray1D();
		System.out.println("Nach welche Zahl wollen Sie suchen?");
		double Treffer = IO.readDouble();
		for (int i=0;i<Zahl.length;i++) {
			if (Zahl[i]!=Treffer) {
				System.out.println("Niete");
			}
			else
			System.out.println("Treffer");
		}
		

	}

	}
