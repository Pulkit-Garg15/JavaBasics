package practice;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number whose factorial is to be calculated ");
		int fac = 1;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fac = fac * i;
		}
System.out.println(fac);
sc.close();
	}

}
