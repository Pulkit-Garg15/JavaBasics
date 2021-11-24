package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the number of students in the class : ");
//		
//		int n = sc.nextInt();
//		
//		int marks[] = new int[n];
//		
//		System.out.println("Enter the marks now ");
//		
//		for (int i = 0; i < n; i++) {
//			marks[i] = sc.nextInt();
//		}
//		
//		int average = 0;
//		
//		for (int i = 0; i < n; i++) {
//			average += marks[i];
//		}
//		
//		average /= n;
//		
//		System.out.println("The average marks of the students are : " + average);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students ");
		int n = sc.nextInt();
		int marks[] = new int[n];
		System.out.println("Enter the marks of students : ");
		
		for(int i = 0; i < n; i++) {
			marks[i] = sc.nextInt();
		}
		
		int averageMarks = 0;
		
		for(int i = 1; i < n; i++) {
			averageMarks += marks[i];
		}
		
		averageMarks /= n;
		
		System.out.println("Average marks of the students of this class are " + averageMarks);
		sc.close();
	}

}
