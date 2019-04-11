package com.narendra;

import java.util.Scanner;

public class Denomination {

	
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n>=500){
			a=n/500;
			System.out.println("Notes required of 500 :"+a);
			break;
		}
		while(n>=100){
			a=n/100;
			System.out.println("Notes required of 100 : "+a);
			break;
		}
		while(n>=10){
			a=n/10;
			System.out.println("Notes required of 10 : "+a);
			break;
		}
	} 
	
	
}
