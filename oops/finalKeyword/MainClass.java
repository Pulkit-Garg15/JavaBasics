package oops.finalKeyword;

public class MainClass extends Student {
	
	final String name = "sa";
	
//	public void getDescription() {
//		System.out.println("This is from main class");
//	}

	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		obj.getDescription();
		
//		final Student abc = new Student();
//		Student cba = new Student();
//		
//		abc = cba;
//		abc.name = "d";

	}

}
