package practice;

public class TableOneToTwenty {

	public static void main(String[] args) {
		
		int result = 0;
		
		for (int n = 1; n <= 20; n++) {
			for (int i = 1; i <= 10; i++) {
				result = i * n;
				System.out.print(result + " ");
			}
			System.out.println();
		}

	}

}
