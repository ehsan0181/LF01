import java.io.IOException;
import java.util.Arrays;

import oop.IO;

public class BubbleSort {
	public static void main(String args[]) {

		int[] array ={1,5,8,2,7,4};
		int zwischen;
		boolean tausch = false; 
		
		do {
			tausch = false;			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					zwischen = array[i];
					array[i] = array[i + 1];
					array[i + 1] = zwischen;
					tausch = true;
				}

			} 
		} while (tausch == true);
		//// Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
	} 
}
