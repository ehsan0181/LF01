package Aufgaben;

import java.io.IOException;

import oop.IOklasse;

public class Summen {

	public static void main(String[] args) throws IOException {
	        double Werte []= IOklasse.readDoubleArray1D();
	        int anzahlgerade=0;
	        int anzahlungerade=0;
	        double gerade=0;
	        double ungerade =0;
	        System.out.println("Anzahl der Zahlen:");
	        for (int i=0;i<Werte.length;i++) {
	        	if (Werte [i]%2 ==0) {
	        		gerade = Werte[i]+gerade;
	        		anzahlgerade = 1+anzahlgerade;
	        		
	        		
	        		
	        	
	        		 	}
	        	else {
	        		ungerade = Werte[i]+ungerade;
	        		anzahlungerade = 1+anzahlungerade;
	        		
	     
	        	}
	        }
	        System.out.println("Anzahl der Geradezahlen: "+anzahlgerade);
			System.out.println("Anzahl der Ungeradezahlen: "+anzahlungerade);    
		    System.out.println(gerade+ "\t"+ ungerade);
		
	}

}
