import java.io.IOException;

import oop.IO;

public class Temperatur {

	public static void main(String[] args) throws IOException {
		
		//Eingabe in der Console
			System.out.print("Geben Sie die Temperatur an Tag 1 ein: ");
			double t1 =IO.readDouble();
			System.out.print("Geben Sie die Temperatur an Tag 2 ein: ");
			double t2 =IO.readDouble();
			System.out.print("Geben Sie die Temperatur an Tag 3 ein: ");
			double t3 =IO.readDouble();
			System.out.print("Geben Sie die Temperatur an Tag 4 ein: ");
			double t4 =IO.readDouble();
			System.out.print("Geben Sie die Temperatur an Tag 5 ein: ");
			double t5 =IO.readDouble();
			System.out.print("Geben Sie die Temperatur an Tag 6 ein: ");
			double t6 =IO.readDouble();
			System.out.print("Geben Sie die Temperatur an Tag 7 ein: ");
			double t7 =IO.readDouble();
		//Bearbeitung in der Console
			double formell = (t1+t2+t3+t4+t5+t6+t7)/7;
		//Ausgabe in der Console	
			double maximal=Math.max(Math.max(t1, t2),Math.max(t3,t4));
			double maximal8=Math.max(Math.max(t5,t6),Math.max(t7,t6)); 
			double maximal9= Math.max(maximal8,maximal);
			System.out.println("Der Mittelwert beträgt "+ formell);
			System.out.println("Der Maximalwert lautet "+ maximal9);
			
		
		
		}
		}
		
		
	

