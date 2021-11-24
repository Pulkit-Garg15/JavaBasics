package test;

public class ArrayQuestion {

	public static void main(String[] args) {
		
		int temp, size, first, second;
	      int array[] = {10, 20, 25, 63, 96, 57, 10, 67, 54, 14};
	      size = array.length;

	     first = second = Integer.MIN_VALUE;
	        for (int i = 0; i < size; i++) {
	            
	            if (array[i] > first) {
	                second = first;
	                first = array[i];
	            }
	 
	            else if (array[i] > second && array[i] != first)
	                second = array[i];
	        }
	 
	        if (second == Integer.MIN_VALUE)
	            System.out.print("There is no second largest"
	                             + " element\n");
	        else
	            System.out.print("The second largest element"
	                             + " is " + second);

	    for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println(" and the smallest element of the array is:: "+array[0]);
	   }

	}
