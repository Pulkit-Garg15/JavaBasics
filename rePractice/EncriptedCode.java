package rePractice;

import java.util.Scanner;

public class EncriptedCode {

	 public static StringBuffer encrypt(String text)
	    {
	        StringBuffer result= new StringBuffer();
	 
	        for (int i=0; i<text.length(); i++)
	        {
	        	if((int)text.charAt(i) >= 48 && (int)text.charAt(i) <= 57) {
	        		char ch = (char) ((int)text.charAt(i) + 4);
	        		result.append(ch);
	        	}
	            
	        }
			return result;
	    }
	 
	    // Driver code
	    public static void main(String[] args)
	    {
	    	Scanner sc = new Scanner(System.in);
	        String text = sc.next();
	        System.out.println(encrypt(text));
	        
	        sc.close();
	    }

}
