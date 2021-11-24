package rePractice;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int result = 1;
		
		for(int i = 1; i <= 20; i++) {
			for(int j = 1; j <= 20; j++) {
				result = i * j;
				System.out.print(result + " ");
			}
			System.out.println();
		}
		
	}

}
