package trainingsaufgabe;

import java.io.IOException;

import oop.IO;

public class Wurzel {

	public static void main(String[] args) throws IOException{
		
		 
		System.out.println("Geben Sie eine Zahl ein?");
		 int x = IO.readInteger();
		 
		 if (x>0) {
			 double nummer =  Math.sqrt(x);
			 System.out.println("Das Erbebnis lautet "+ nummer);
		 }
		 else {
			 System.out.println("Die Berechung ist nicht möglich");
		 }
	}

}
