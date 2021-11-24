package loops;

public class ForLoop {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 100; i = i + 1 ) {
//			System.out.println("Hello World " + i);
//		}
		
//		int sum = 0;
//		int n = 100;
//		for (int i = 1; i <= n; i++) {
//			sum = sum + i;
//		}
//     System.out.println(sum);
//	}
        
//		for (int i = 100; i >= 1; i = i - 1) {
//		System.out.println(i);	
//		}
		
//		int tableOf = 4;
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(tableOf * i);
//		}
		
		int fac = 1;
		int n = 5; 
		for (int i = 1; i <= n; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
	}
}

