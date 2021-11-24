package rePractice;

import java.util.Scanner;

public class PowerRaisedToOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 1;
		
		for(int i = 1; i <= y; i++) {
			result *= x;
		}
		
		System.out.println("The " + y + " power of number " + x + " is equal to " + result);
		sc.close();
	}
	
}
