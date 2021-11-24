package oops;

public class MethodsIntro {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 46;
		
		int result = maxOf(firstNumber , secondNumber);
		
		System.out.println(result);
		
		sayHi();
		
	}
	
	static int maxOf(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good Morning");
	}

}
