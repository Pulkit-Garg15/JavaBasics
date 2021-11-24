package rePractice;

public class Anagrams {

	public static void main(String[] args) {
		
		String a = "acc";
		String b = "acc";
		boolean anagram = false;
		boolean visited[] = new boolean[b.length()];
		
		if(a.length() == b.length()) {
	
			for(int i = 0; i < a.length(); i++) {
				anagram = false;
				for(int j = 0; j < b.length(); j++) {
					if(b.charAt(j) == a.charAt(i) && !visited[j] ) {
						visited[j] = true;
						anagram = true;
						break;
					}
				}
				if(!anagram) {
					break;
				}
			}
			
		}

		if(anagram == true) {
			System.out.println("a and b are Anagrams");
		} else {
			System.out.println("a and b are not Anagrams");
		}
		
	}

}
