package practice;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    for(int i=1;i<=n;i++){
	      
	      for(int j=1;j<=n;j++){
	        
	        
	        if(j<(n+1)/2-i+1 ||j>(n+1)/2+i-1||j<=i-(n+1)/2||j>(3*n+1)/2-i)
	        System.out.print("* ");
	        else
	        System.out.print("  ");
	        
	      
	      }
	      System.out.println();
	    }

	}

}
