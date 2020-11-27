package oop;

import java.io.IOException;

public class Aufgabe4 {

	public static void main(String[] args) throws IOException {
		double[][] tableDouble = IO.readDoubleTable();
		IO.writeDoubleTable(tableDouble);
		System.out.println("Wie viele Zeilen für die zweite Matrix: ");
		int zeile = IO.readInteger();
		System.out.println("Wie viele Spalten für die zweite Matrix: ");
		int spalte = IO.readInteger();
		double[][] tableDouble2 = IO.readDoubleTable(zeile, spalte);
		IO.writeDoubleTable(tableDouble2);
		System.out.println("Wie viele Zeilen für die dritte Matrix: ");
		int zeileTable3 = IO.readInteger();
		System.out.println("Wie viele Spalten für die dritte Matrix: ");
		int spalteTable3 = IO.readInteger();
		double[][] tableDouble3 = new double[zeileTable3][spalteTable3];
		IO.readDoubleTable(tableDouble3);
		IO.writeDoubleTable(tableDouble3);
	}

}
