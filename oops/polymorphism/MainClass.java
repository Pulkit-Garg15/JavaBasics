package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
//		Dog d = new Dog();
//		
//		Pet p = d;
//		
//		d.walk();
//		p.walk();
		
		greetings("YO");

	}
	
	public static void greetings() {
		System.out.println("Hi");
	}
	
	public static void greetings(String name) {
		System.out.println(name);
	}
	
	public static void greetings(String name , int n) {
		for(int i = 0; i < n ; i++) {
			System.out.println("Good Morning");
		}
	}

}
