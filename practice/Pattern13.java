package practice;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("   ");
			}
			
			int number = 1;
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(number++ + "  ");
			}
			System.out.println();
		}

	}

}
