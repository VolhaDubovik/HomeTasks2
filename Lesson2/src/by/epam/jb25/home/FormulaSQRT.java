package by.epam.jb25.home;

import java.util.Scanner;

public class FormulaSQRT {
	public static void main (String[] args) {
		double a = 0, b = 0, c = 0, d;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.print("Введите b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.print("Введите c: ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}
		
		double temp;
		temp = 2 * a;
		if (temp != 0) {
			int b1 = 2; // степень в которую нужно возвести число b
			int a1 = 3; // степень в которую нужно возвести число a
			d = ((b + Math.sqrt (Math.pow(b, b1) + 4 * a * c)) / temp) - Math.pow(a, a1) * c + b; // Math.pow(a, a1) возведение в степень
		} else {
			System.out.println("Знаменатель равен нулю.");
			d = Double.NaN;
		}
		
		System.out.println("d=" + d);
	}
	
}
