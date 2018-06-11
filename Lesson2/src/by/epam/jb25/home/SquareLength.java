package by.epam.jb25.home;

import java.util.Scanner;

public class SquareLength {
	public static void main (String[] args) {
		
		double R = 0, L = 0, S = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите R: ");
		if (sc.hasNextDouble()) {
			R = sc.nextDouble();
		}
		
		int R1 = 2;
		L = Math.PI * 2 * R;
		S = Math.pow(R, R1) * Math.PI;
		
		System.out.println("L = " + L + "\nS = " + S);
	}

}