package nl.ru.ai.calvodeboer.excercise3;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quadratic Equation Solver");
		double a;
		do {
			System.out.println("Enter a:");
			a = scanner.nextDouble();
			if (a == 0) {
				System.out.println("a cannot be zero.");
			}
		} while (a == 0);
		System.out.println("Enter b:");
		double b = scanner.nextDouble();
		System.out.println("Enter c:");
		double c = scanner.nextDouble();
		if ((b*b - 4*a*c) == 0) {
			System.out.println("One solution: " + (-b / (2*a)));
		} else if ((b*b - 4*a*c) > 0) {
			System.out.println("First solution: " + (-b + Math.sqrt(b*b - 4*a*c)/2*a));
			System.out.println("Second solution: " + (-b - Math.sqrt(b*b - 4*a*c)/2*a));
		} else {
			System.out.println("No solutions.");
		}
		scanner.close();
	}

}
