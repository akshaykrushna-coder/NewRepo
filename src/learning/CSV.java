package learning;

import java.io.*;
import java.util.Scanner;

public class CSV {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:\\Users\\Aspire\\eclipse-workspace\\learning\\demo.csv"));
		// parsing a CSV file into the constructor of Scanner class
		String s=sc.
		sc.useDelimiter(",");
		// setting comma as delimiter pattern
		int count =0;
		while (sc.hasNext()) {
			System.out.println(sc.next());
			count++;
		}
		sc.close();
		System.out.println(s);
		// closes the scanner
	}

}
