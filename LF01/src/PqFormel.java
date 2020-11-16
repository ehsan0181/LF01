import java.io.IOException;

import oop.IO;

public class PqFormel {

	public static void main(String[] args) throws IOException {
		
		
	//Eingabe in der Console
		
		System.out.println("Geben Sie Bitte ein Wert für p ein:");
		double P = IO.readDouble();
		System.out.println("Geben Sie bitte ein Wert für q ein:");
		double q = IO.readDouble();
		
    //Verarbeitung in der Console
		
		double x1 = -P/2 + Math.sqrt((P/2 * P/2)-q);
		double x2 = -P/2 - Math.sqrt((P/2 * P/2)-q);
		
	//Ausgabe in der Console
		
		System.out.println("Die erste Nullstelle lautet "+ x1);
		System.out.println("Die zweite Nullstelle lautet "+x2);
		
		
		
	}

}
