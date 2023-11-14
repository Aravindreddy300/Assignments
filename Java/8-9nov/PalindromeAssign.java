package com.cg.assignments;

import java.util.Scanner;

public class PalindromeAssign {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String inputString = scanner.nextLine();
		        scanner.close();

		        boolean isPalindrome = true;
		        int length = inputString.length();

		        for (int i = 0; i < length / 2; i++) {
		            if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
		                isPalindrome = false;
		                break;
		            }
		        }

		        if (isPalindrome) {
		            System.out.println(inputString + " is a palindrome.");
		        } else {
		            System.out.println(inputString + " is not a palindrome.");
		        }
		    

	}

}
