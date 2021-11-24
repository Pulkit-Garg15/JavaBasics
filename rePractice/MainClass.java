package rePractice;

class cat {
	String colour;
	int legs, eyes;
	
	public void jump() {
		System.out.println("Cat is jumping");
	}
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	
	public void description() {
		System.out.println("My cat of " + colour + " colour has " + legs + " legs and " + eyes + " eyes");
	}
}

public class MainClass {

	public static void main(String[] args) {
		
		cat cat1 = new cat();
		cat cat2 = new cat();
		
		cat1.colour = "White";
		cat1.legs = 4;
		cat1.eyes = 1;

		cat2.colour = "Black";
		cat2.legs = 3;
		cat2.eyes = 2;
		
		cat1.description();
		cat1.walk();
		cat1.jump();
		
		cat2.description();
		cat2.walk();
		cat2.jump();
		

	}

}
