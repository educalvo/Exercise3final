package nl.ru.ai.calvodeboer.exercise3;

import java.util.Scanner;

public class NewtonRaphson {

	public static void main(String[] args) {
		System.out.println("Square Root Calculator using the Newton Raphson Method");
		squareRootCalculator();
	}

	private static void squareRootCalculator() {
		Scanner scanner=new Scanner(System.in);
		double input = -1;
		while (input < 0) { //Keep asking for input until the user enters an input that is greater than zero.
			System.out.println("Enter a number to find its square root. It cannot be less than zero.");
			input = scanner.nextDouble();
		}
		calculateRoot(input);
		again();
		scanner.close();
	}

	private static void calculateRoot(double input) {
		double x = 1;
		while (Math.abs(x*x - input) > 0.001) {
			x = x - (((x*x)-input)/(2*x)); //Calculate an approximation of the square root of the input
		}
		System.out.println(x);
	}
	private static void again()
	  {
	    Scanner scanner=new Scanner(System.in);
	    String again="n";
	    System.out.print("Want to calculate again? y/n ");
	    again=scanner.next();
	    if(again.equals("y"))
	    {
	      squareRootCalculator();
	    } else if(!again.equals("n"))
	    {
	      System.out.println("Invalid entry, try again");
	      again();
	    }
	    scanner.close();
	  }
}
