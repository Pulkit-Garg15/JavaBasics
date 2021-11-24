package rePractice;

import java.util.Scanner;

public class TableOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 1;
		
			for(int i = 1; i <= 20; i++) {
				result = n * i;
				
				System.out.print(result + " ");
			}
		sc.close();
	}

}
