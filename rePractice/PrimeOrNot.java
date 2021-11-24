package rePractice;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		boolean prime = true;
		
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) {
				prime = false;
			}
		}
		
		if(n == 1) {
			prime = false;
		}

		System.out.println("The number " + n + " is a prime " + prime);
		
		sc.close();
	}

}
