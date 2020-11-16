package trainingsaufgabe;

import java.io.IOException;

import oop.IO;

public class GeometrischeReihe {

	public static void main(String[] args) throws IOException {
        System.out.println("Bitte geben sie N als Ganzzahl ein: ");
        int n = IO.readInteger();
        double ergebniss = 0;

        for(int i = 0; i <= n; i++){
            System.out.println("Index: " + i);
            System.out.println("Ergebniss: " + ergebniss);
            ergebniss = (1 / Math.pow(2, i)) + ergebniss;
            
        }

        
    }
}