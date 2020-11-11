package Aufgaben;

import java.io.IOException;

import oop.IOklasse;

public class Maxima {

	public static void main(String[] args) throws IOException {
		double[] Zahl = IOklasse.readDoubleArray1D();
		double maximal=Zahl[0];
		double maximal2=Zahl[1];
		if (maximal<Zahl[0]) {
			maximal2=Zahl[1];		
		}
		else {
			maximal=Zahl[1];
			maximal2=Zahl [2];
		}
		for (int i=2;i<Zahl.length;i++) {
			if(Zahl[i]>maximal) {
				maximal2=maximal;
				maximal=Zahl[i];
			}
			else if (Zahl [i]>maximal2) {
				maximal2=Zahl[i];
			}
		}
		System.out.println("Die größte Zahl lautet: "+maximal);
		System.out.println("Die zweit größte Zahl lautet: "+maximal2);
	}
}