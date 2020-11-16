import java.io.IOException;

import oop.IO;

public class Pqformelxxl {

	public static void main(String[] args) throws IOException {
		
	
			//Eingabe in der Console
		
				System.out.println("Geben Sie Bitte einen Wert für a ein:");
				double a = IO.readDouble();
				System.out.println("Geben Sie bitte einen Wert für b ein:");
				double b = IO.readDouble();
				System.out.println("Geben Sie bitte einen Wert für c ein:");
				double c =IO.readDouble();
				double d =  (b*b-4*a*c);
				
		    //Verarbeitung in der Console
				
				double x1 = (-b + Math.sqrt(d))/2*a;
				double x2 = (-b - Math.sqrt(d))/2*a;
				
			
				
				
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
