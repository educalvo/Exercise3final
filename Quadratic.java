package nl.ru.ai.calvodeboer.exercise3;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Quadratic Equation Solver");
		quadraticSolver();
	}

	private static void quadraticSolver() {
		Scanner scanner = new Scanner(System.in);
		double a;
		do {
			System.out.println("Enter a value for 'a' (cannot be zero):");
			a = scanner.nextDouble();
		} while (a == 0);
		System.out.println("Enter a value for 'b':");
		double b = scanner.nextDouble();
		System.out.println("Enter a value for 'c':");
		double c = scanner.nextDouble();
		scanner.close();
		calculateRoots(a,b,c);
		again();
	}

	private static void calculateRoots(double a, double b, double c) {
		if ((b*b - 4*a*c) == 0) {
			System.out.println("One solution: " + (-b / (2*a)));
		} else if ((b*b - 4*a*c) > 0) {
			System.out.println("First solution: " + (-b + Math.sqrt(b*b - 4*a*c)/2*a));
			System.out.println("Second solution: " + (-b - Math.sqrt(b*b - 4*a*c)/2*a));
		} else {
			System.out.println("No solutions.");
		}
	}
	private static void again()
	  {
	    Scanner scanner=new Scanner(System.in);
	    String again="n";
	    System.out.print("Want to calculate again? y/n ");
	    again=scanner.next();
	    if(again.equals("y"))
	    {
	      quadraticSolver();
	    } else if(!again.equals("n"))
	    {
	      System.out.println("Invalid entry, try again");
	      again();
	    }
	    scanner.close();
	  }

}
