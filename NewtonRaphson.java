package nl.ru.ai.calvodeboer.excercise3;

import java.util.Locale;
import java.util.Scanner;

public class NewtonRaphson {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		scanner.useLocale(Locale.US); //Without this line, the program only accepts using commas for decimals (like 4,5 instead of 4.5)
		double a;
		for (a = 0; a < 1; a = scanner.nextDouble()) {
			System.out.println("Enter a number to find its square root. It cannot be less than one.");
		}
		double fOfA = 10000;
		double x = 1;
		for (int i = 0; fOfA >= 0.001; i++) {
			x = x - (((x*x)-a)/(2*x));
			fOfA = x*x - a;
			if (fOfA < 0) {
				fOfA = fOfA*-1;
			}
		}
		System.out.println(x);
		scanner.close();
	}

}
