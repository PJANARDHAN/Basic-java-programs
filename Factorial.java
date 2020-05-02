package com.basic;

public class Factorial {
	public static void main(String[] args) {
		int n=6,fact=1;
		//System.out.println(factorial(n));
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
	/*
	public static int factorial(int n)
	{
		int fact=1;
		if(n<0) {
			return 0;
		}
		else if(n==0||n==1) {
			return 1;
		}
		else {
			
			for(;n>1;n-=1)
				fact*=n; 
		}return fact;
		
	}
	*/
	
	/*
	 * one line code for factorial
	 * 
	 */
}
