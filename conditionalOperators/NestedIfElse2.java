package conditionalOperators;

public class NestedIfElse2 {

	public static void main(String[] args) {
		
		double a = 40.5;
		double b = 20.1;
		double c = 9.8;
		
		double result = 0;
		
		if (a > b) {
			if (a > c) {
				result = a;
			}
			else {
				result = c;
			}
			
		}
			else {
				if (b > c) {
					result = b;
				} else {
					result = c;
				}
			}
		System.out.println("The maximum of three numbers is " + result);
			
  }
}