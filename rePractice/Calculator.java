package rePractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the operation to be performed");
		sc.nextLine();
		
		char c = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(c) {
		case '+' :
			result = a + b ;
			break;
		case '-' :
			result = a - b;
			break;
		case '*' :
			result = a * b;
			break;
		case '/' :
			result = a / b;
			break;
			default :
				System.out.println("Invalid Operation");
		}
		
		System.out.println("The result is " + result);

	}

}
