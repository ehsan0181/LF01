import java.io.IOException;

import oop.IO;

public class IOarray {

	public static void main(String[] args) throws IOException {
		
		//Mit Integer (Ganzzahl)
		int[] zahl = new int[3];
		for (int i=0; i<zahl.length;i++) {
		System.out.println("Bitte geben Sie "+(i+1)+" Ganzzahl ein");
		zahl [i]=IO.readInteger();
		System.out.println("Die "+(i+1)+"te Ganzzahl lautet: "+zahl[i]);
		System.out.println("=============");
		}	
		System.out.println("=============");
		//Mit Double
		double[]zahl1=new double[3];
		for (int i=0; i<zahl1.length;i++) {
			System.out.println("Bitte geben Sie "+(i+1)+" Zahl ein");
			zahl1 [i]=IO.readDouble();
			System.out.println("Die "+(i+1)+"te Zahl lautet: "+zahl1[i]);
			System.out.println("=============");
		}
		System.out.println("=============");
		//Mit String
		String[] text=new String [3];
		for(int i=0;i<text.length;i++) {
			System.out.println(+(i+1)+"Wort lautet: ");
			text [i]=IO.readString();
			
				
		}
		System.out.println("Der Satz ist:"+text[0]+" "+text[1]+" "+text[2]+".");
		}
		
	}
	

