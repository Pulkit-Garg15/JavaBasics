package whileLoops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = 1;
		
		do {
			
			n = sc.nextInt();
			
		} while (n != 0);
		
		System.out.println("Number is " + n);

	}

}
