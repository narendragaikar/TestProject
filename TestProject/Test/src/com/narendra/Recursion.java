package com.narendra;

import java.io.File;

public class Recursion {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		
			int a[]={2,12,13,45,78,90,100};
			System.out.println(binarySearch(a, 13, 0, 6));
			System.out.println(new File("E:\\").length());
	}
	
	//getting factorial value 
	public static int factorial(int n)throws IllegalArgumentException{
		if(n<0){
			throw new IllegalArgumentException();
		}
		if(n==0){
			return 1;
		}
		else
		{
			return factorial(n-1)*n;
		}
	}
	
	///binary search
	public static boolean binarySearch(int[] data,int target,int low,int high){
		
		if(low>high){
			return false;
		}
		else{
			int mid=(low+high)/2;
			if(data[mid]==target){
				return true;
			}
			if(target<data[mid]){
				return binarySearch(data, target, 0, mid-1);
			}else{
				return binarySearch(data, target, mid+1, high);
			}
			
		}
	}
}
