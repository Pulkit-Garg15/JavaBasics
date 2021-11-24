package oops;

class cat {
	
	String color;
	int legs, eyes;
	
	public void jump () {
		System.out.println("My cat is jumping");
	}
	
	public void description() {
		System.out.println("My cat is " + color + " in colour and has " + legs + " legs and " + eyes + " eyes");
	}
	
}

class dog {
	
	String breed, name;
	int age;
	
	public void description() {
		System.out.println("My dog " + name + " is " + breed + " breed and is " + age + " years old");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
//		cat cat1 = new cat();
//		cat cat2 = new cat();
//		
//		cat1.color = "white";
//		cat1.legs = 3;
//		cat1.eyes = 4;
//		
//		cat2.color = "black";
//		cat2.legs = 4;
//		cat2.eyes = 2;
//		
//		cat1.jump();
//		cat1.description();
//		
//		cat2.jump();
//		cat2.description();
		
		dog husky = new dog();
		dog poodle = new dog();
		
		husky.breed = "Husky";
		husky.name = "Jya";
		husky.age = 2;
				
		poodle.breed = "Poodle";
		poodle.name = "Dusky";
		poodle.age = 1;		
		
		husky.description();
		
		poodle.description();

	}

}
