package rePractice;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dayOfWeek = sc.nextInt();
		
		switch(dayOfWeek) {
		case 1 :
		case 2 :
			System.out.println("I'm in office");
			break;
		case 3 :
			System.out.println("I'm playing football");
			break;
		case 4 :
			System.out.println("I'm dsivji");
			break;
		case 5 :
			System.out.println("ihofeioew");
			break;
		default :
			System.out.println("Nothing to do bro");
		}

	}

}
