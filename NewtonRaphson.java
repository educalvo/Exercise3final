package nl.ru.ai.calvodeboer.exercise3;

import java.util.Locale;
import java.util.Scanner;

public class NewtonRaphson {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		scanner.useLocale(Locale.US); //Without this line, the program only accepts using commas for decimals (like 4,5 instead of 4.5)
		double input;
		for (input = 0; input < 1; input = scanner.nextDouble()) { //Keep asking for input until the user enters an input that is greater than or equal to one.
			System.out.println("Enter a number to find its square root. It cannot be less than one.");
		}
		calculateRoot(input);
		scanner.close();
	}

	private static void calculateRoot(double input) {
		double approximationAccuracy = 10000;
		double squareRoot = 1;
		while (approximationAccuracy >= 0.001) {
			squareRoot = squareRoot - (((squareRoot*squareRoot)-input)/(2*squareRoot)); //Calculate an approximation of the square root of the input
			approximationAccuracy = squareRoot*squareRoot - input; //Calculate new accuracy
			if (approximationAccuracy < 0) { //Absolute value of approximationAccuracy
				approximationAccuracy = approximationAccuracy*-1;
			}
		}
		System.out.println(squareRoot);
	}

}
