package practice;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int row = 2*i - 2; 
			
			for (int j = 1; j <= row; j++) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
