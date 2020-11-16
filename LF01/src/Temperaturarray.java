import java.io.IOException;

import oop.IO;

public class Temperaturarray {

	public static void main(String[] args) throws IOException {
		

		double [] tage = new double[7];
		for (int i = 0; i < tage.length; i++) {
			System.out.println("Geben Sie die Temperatur an Tag " +(i+1)+ " ein");
			tage[i]=IO.readDouble();

		}

		double summe = tage [0]+tage [1]+tage [2]+tage [3]+ tage[4]+tage[5]+tage[6];
		double mittelweert =summe/7;
		//oder double mittelwertt =(tage [0]+tage [1]+tage [2]+tage [3]+ tage[4]+tage[5]+tage[6])/tage.length
		//double maximal=Math.max(Math.max(tage [0], tage [1]),Math.max(tage [2],tage [3]));
		//double maximal2=Math.max(Math.max(tage [4],tage[5]),Math.max(tage[6],tage [1]));
		//double max= Math.max(maximal,maximal2);
		
		//
		double max = tage[0];
		for (int i=1;i<tage.length;i++)
		{
			if (max<tage[i]) { 
				max = tage[i];
			}
		
		}
		System.out.println("Das Mittelwert lautet "+ mittelweert);
		System.out.println("Das Maximale Wert lautet: "+max);
	}
	}
