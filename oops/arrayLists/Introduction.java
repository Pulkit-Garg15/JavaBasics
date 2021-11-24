package oops.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Introduction {

	public static void main(String[] args) {
		
		List <String> fruits = new ArrayList<>();
		List <String> vegetables = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		vegetables.add("Onion");
		vegetables.add("Potato");
		vegetables.add("Spinach");
		
//		fruits.addAll(vegetables);
		
//		System.out.println(fruits);
		
//		System.out.println(fruits.get(0));
		
//		vegetables.set(2,"Brinjal");
		
//		System.out.println(vegetables);
		
		System.out.println(fruits.size());
		
	}

}
