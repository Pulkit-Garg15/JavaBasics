package oops.interfaces;

public class Person implements Student , Youtuber {

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideos();
//		obj.editVideos();

	}

	@Override
	public void makeVideos() {
		
		System.out.println("Person is making videos");
	
	}

	@Override
	public void study() {
		
		System.out.println("Person is studying");
		
	}

	@Override
//	public void editVideos() {
//		
//		System.out.println("Person is editing videos");
		
	}

}
