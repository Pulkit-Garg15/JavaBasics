package rePractice;

public class AnagramNLogNMethod {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = "cbb";
		
		boolean anagram = true;
		
		int al[] = new int[256];
		int bl[] = new int[256];
		
		for(char c : a.toCharArray()) {
			int i = (int) c;
			al[i]++;  
//			since every character is assigned a ASCII number, here first conversion of the character to it's ASCII number happens by
//			by type casting and then the default value of 0 in the ASCII array "al" is increased by 1 the number of times the 
//			character is found inside array c at the i'th position of "al"
		}
		
		for(char c : b.toCharArray()) {
			int i = (int) c;
			bl[i]++;  
		}
		
		for(int i = 0; i < 256; i++) {
			if(al[i] != bl[i]) {
				anagram = false;
			}
		}
		
		if(anagram == true ) {
			System.out.println("a and b are anagrams");
		} else {
			System.out.println("a and b are not anagrams");
		}
		
	}

}
