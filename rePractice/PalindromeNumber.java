package rePractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int temp = n;
		int reversedNumber = 0;
		
		while(temp > 0) {
			int lastDigit = temp % 10;
			temp /= 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			
		}
		if (reversedNumber == n) {
			System.out.println("The number " + n + " is a Palindrome number");
		} else {
			System.out.println("The number " + n + " is not a Palindrome number");
		}
		sc.close();
	}

}
