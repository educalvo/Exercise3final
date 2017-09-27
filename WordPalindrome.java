package nl.ru.ai.calvodeboer.exercise3;

import java.util.Scanner;

public class WordPalindrome {

	public static void main(String[] args) {
		palindromeChecker();
	}

	private static void palindromeChecker() {
		boolean isPalindrome = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scanner.next();
		scanner.close();
		for (int letterCheck = 0; letterCheck < word.length(); letterCheck++) {
			if (word.charAt(word.length()-(letterCheck+1)) == word.charAt(letterCheck)) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				letterCheck = word.length() + 1; //Ends the loop
			}
		}
		printResult(isPalindrome);
		again();
		scanner.close();
	}

	private static void printResult(boolean isPalindrome) {
		if (isPalindrome) {
			System.out.println("This word is a palindrome.");
		} else {
			System.out.println("This word is NOT a palindrome.");
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
	      palindromeChecker();
	    } else if(!again.equals("n"))
	    {
	      System.out.println("Invalid entry, try again");
	      again();
	    }
	    scanner.close();
	  }
}