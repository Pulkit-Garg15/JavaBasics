package oops;

class Vehicle {
	int wheels , headlights;
	String colour , name;
	
	Vehicle() {
		wheels = 4;
		headlights = 2;
		colour = "White";
	}
	
	Vehicle(int noOfWheels) {
		wheels = noOfWheels;
		headlights = 2;
		colour = "White";
	}
	
	Vehicle(int noOfWheels , String colour) {
		wheels = noOfWheels;
		headlights = 2;
		this.colour = colour;
	}
	
	public void description() {
		System.out.println(name + " has " + wheels + " wheels, " + headlights + " headlights and is of " + colour + " colour");
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		
		Vehicle car1 = new Vehicle();
		Vehicle car2 = new Vehicle(4);
		Vehicle car3 = new Vehicle(4 , "Red");
		Vehicle scooty = new Vehicle(2 , "Black");
		
		car1.name = "Maruti 800";
		car2.name = "Toyota Fortuner";
		car3.name = "Ferrari";
		scooty.name = "Honda Activa";
		
		car1.description();
		car2.description();
		car3.description();
		scooty.description();
		
	}

}
