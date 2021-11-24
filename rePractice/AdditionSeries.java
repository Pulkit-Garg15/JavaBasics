package rePractice;

import java.util.Scanner;

public class AdditionSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float result = 0;
		
		for(float i = 1; i <= n; i++) {
			result += 1/i;
		}
		sc.close()	;
		System.out.println(result);
		
	}

}
