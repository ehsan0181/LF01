package trainingsaufgabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import oop.IO;

public class AltersPrüfung {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Wie ist dein Name?");
		String name = IO.readString();
		System.out.println("Moin "+ name);
		System.out.println("Wie alt sind Sie?");
		String eingabe = bufferedReader.readLine();
		int alter = Integer.parseInt(eingabe);

		if (alter>18) {
			System.out.println("du bist volljährig");			
		}
		else if (alter<18) {
			System.out.println("du bist minderjährig");
			System.out.println("Vielen Dank:)");
		}
	}
}
