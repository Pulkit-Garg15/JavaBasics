package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int temp = n;
		
		int reverse = 0;
		
		while (temp > 0) {
			
			int lastdigit = temp % 10;
			
			reverse = reverse * 10 + lastdigit;
			
			temp /= 10;
			
		}
		
		if (reverse == n) {
			System.out.println("The number " + n + " is palindrome");
		} else {
			System.out.println("The number " + n + " is not palindrome");
		}

	}

}
