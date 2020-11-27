package oop;

import java.io.IOException;

public class Aufgabe4 {

	public static void main(String[] args) throws IOException {
		System.out.println("Erste Matrix mit Ganzzahl: ");
		int [][] matrix1=IO.readIntegerTable();
		IO.writeIntegerTable(matrix1);
		System.out.println("Zweite Matrix mit Kommazahl: ");
		double [][] matrix2=IO.readDoubleTable();
		IO.writeDoubleTable(matrix2);
		System.out.println("Dritte Matrix mit String: ");
		String [][] matrix3=IO.readStringTable();
		IO.writeStringTable(matrix3);
		
		
	}
	


}
