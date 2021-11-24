package conditionalOperators;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		int dayOfWeek = 1;
		
		switch(dayOfWeek) {
		
		case 1:
		case 6:
		case 7:
			
			System.out.println("I'm on leave");
			break;
		case 2:
			System.out.println("I'm in office");
			break;
		case 3:
			System.out.println("I'll go out");
			break;
			
		default:
			System.out.println("I don't know what day it is");
		}

	}

}
