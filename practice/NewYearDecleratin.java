package practice;

import java.util.Scanner;

public class NewYearDecleratin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year to be checked ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
		
	}

}
