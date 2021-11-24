package oops.twoPointAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Input the Array: ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Solution g = new Solution();
		
		if(g.findTriplets(arr, n)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
}

class Solution {
	
	public boolean findTriplets (int arr[], int n) {
		Arrays.sort(arr);
		for(int i = 0; i < n-2; i++) {
			if(twoSum(arr , -arr[i] , i+1)) {
				return true;
			}
		}
		return  false;
	}
	
	public boolean twoSum(int a[] , int x , int i) {
		int j = a.length - 1;
		while(i < j) {
			if(a[i] + a[j] < x) {
				i++;
			} else if(a[i] + a[j] > x) {
				j--;
			} else {
				return true;
			}
		}
		return false;
	}
}
