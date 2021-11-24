package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
		fun1();
		System.out.println("Exception is handled");
		System.out.println("This code is important");
		
	}
	
	static void fun1() {
		
		try {
			
			int a = 5;
			int b = 0;
			int c = a/b;
		
			System.out.println(c);
		
		} catch(ArithmeticException e) {	
//			ArithmeticException is the exception class and e is the exception class object 
			System.out.println(e.getMessage() + " is the exception");
		} finally {
			System.out.println("sorry for inconvenience");
		}

	}
	
}
