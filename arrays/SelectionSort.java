package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {4, 6, 8, 2, 0};
		int n = a.length;
		
		for(int i = 0; i < n-1; i++) {
			int min = i;
			for(int j = i; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}

		for(int e: a) {
			System.out.print(e + "  ");
		}
		
	}

}
