package practice;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {8 , 6 , 3 , 2 , 0 , -5};
		
		int n = a.length;
		
		for (int i = 0; i < n-1; i++) {
			
			boolean sort = true;
			
			for(int j = 0; j < n-1-i; j++) {
								
				if(a[j+1] < a[j]) {
				int temp = a[j+1];
				a[j+1] = a[j];
				a[j] = temp;
				
				sort = false;
				}
			}
			
			if (sort) break;
			
		}
		
			for(int e: a) {
				System.out.print(e + "  ");
			}
		
		}

	}

