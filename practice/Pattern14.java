package practice;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("  ");
			}
			
			int number = i;
						
			System.out.print(number++ + " ");
			for (int j = 1; j <= 2*i-3; j++) {
				System.out.print(0 + " ");
			}
			
			if (i > 1) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
