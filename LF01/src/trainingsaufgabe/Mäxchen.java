package trainingsaufgabe;

import java.io.IOException;



import oop.IO;

public class Mäxchen {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Geben Sie Ihre esrte Würfel ein");
		int wuerfel1 = IO.readInteger();
		System.out.println("Geben Sie Ihre zweite Würfel ein");
		int wuerfel2 = IO.readInteger();
		
		if ((wuerfel1 ==1 && wuerfel2 ==2) || (wuerfel2 ==2 && wuerfel2==1)){
			
		System.out.println("Prima :) Mäxcehn. Sie haben 1000 Punkte erhalten ");
		
		}
		else if(wuerfel1==wuerfel2) {
			int pasch = wuerfel1*100;
			System.out.println("Pasch!Du hast "+pasch+"Punkt erreicht!");
		}
		
		else {
			int point =10* Math.max(wuerfel1, wuerfel2) + Math.min(wuerfel1, wuerfel2);
			System.out.println("Sie haben " +point+ " Punkte erhalten");
			
			
			
		}
	
	}
       
}
