package rePractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		int result = 0;
		
		for(int i = 1; i <= n-2; i++ ) {
			result = a + b;
			a = b;
			b = result;
			
			System.out.print(result + " ");
			
		}
				
	}

}
