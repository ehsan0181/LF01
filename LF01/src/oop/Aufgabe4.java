package oop;

import java.io.IOException;

public class Aufgabe4 {

	public static void main(String[] args) throws IOException {
		double[][] tableDouble = IO.readDoubleTable();
		IO.writeDoubleTable(tableDouble);
	}

}
