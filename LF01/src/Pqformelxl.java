import java.io.IOException;

import oop.IO;

public class Pqformelxl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Eingabe in der Console
		
				System.out.println("Geben Sie Bitte ein Wert für p ein:");
				double P = IO.readDouble();
				System.out.println("Geben Sie bitte ein Wert für q ein:");
				double q = IO.readDouble();
				double d = Math.sqrt((P/2 * P/2)-q);
				
		    //Verarbeitung in der Console
				
				double x1 = -P/2 + d ;
				double x2 = -P/2 - d;
				
				
            //Ausgabe in der Console
				
				if (d==0) {
					System.out.println("Doppelte Nullstelle lautet "+x1);
				}
				else if (d<0 ) {
					System.out.println("Berechung nicht möglich");
				}	
				
				else {
					System.out.println("Die erste Nullstelle lautet " +x1);
				    System.out.println("Die zweite Nullstelle lautet "+x2);
				
					
				}
				
	}
				
				
	}


