package nl.ru.ai.calvodeboer.excercise3;

import java.util.Scanner;

public class WordPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scanner.next();
		boolean isPalindrome = false;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(word.length()-(i+1)) == word.charAt(i)) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
		}
		if (isPalindrome) {
			System.out.println("This word is a palindrome.");
		} else {
			System.out.println("This word is not a palindrome.");
		}
		scanner.close();
	}

}