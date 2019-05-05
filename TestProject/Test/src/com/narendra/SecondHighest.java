package com.narendra;

import java.util.ArrayList;
import java.util.List;


public class SecondHighest {
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		
		
		int input[]={0,1,5,6};
		System.out.println(min(input));
	}
	
	public static int min(int []a){
		int min=a[0];
		int min2=a[1];
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min2=min;
				min=a[i];
			}else if(a[i]<min2){
				min2=a[i];
			}
		}
		return min2;
	}
}
