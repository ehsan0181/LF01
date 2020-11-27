package oop;

import java.io.IOException;

public class IOMatrizen {

	public static void main(String[] args) throws IOException {
		System.out.print("wie viele Zeilen? ");
		int anzahlZeil=IO.readInteger();
		System.out.print("Wie viele Spalten? ");
		int anzahlSpalte = IO.readInteger();
		int [][] zahlen = new int [anzahlZeil][anzahlSpalte];
		for(int i=0;i<zahlen[anzahlZeil].length;i++) {
			
			for(int j=0; j< zahlen[anzahlSpalte].length;j++) {
				zahlen[anzahlZeil][anzahlSpalte]=i-j;
				
		}

	}
		

}
}