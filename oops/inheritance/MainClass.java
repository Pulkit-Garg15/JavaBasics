package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Mr. Henry";
		t.walk();
		t.eat();
		t.teach();
		
		Singer s = new Singer();
		s.name = "Atif Aslam";
		s.eat();
		s.walk();
		s.sing();

	}

}
