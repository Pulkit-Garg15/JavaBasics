package rePractice;

import java.util.Scanner;

public class AdditionUsingMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		
		int result = additionOf(firstNumber , secondNumber);
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + result);

	}
	
	static int additionOf(int a , int b) {
		int result = a + b;
		return result;
	}

}
