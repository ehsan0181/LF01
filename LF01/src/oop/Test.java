package oop;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie hei�en Sie?");
		String name = IO.readString();
		System.out.println("Moin " + name);
		
	}

}
