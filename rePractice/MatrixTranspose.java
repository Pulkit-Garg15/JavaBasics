package rePractice;

import java.util.Scanner;

public class MatrixTranspose {
	
	public static void display(int[][] matrix) {
        
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int[][] transpose = new int[cols][rows];
		for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
		
		display(transpose);
		
		sc.close();
	}

}
