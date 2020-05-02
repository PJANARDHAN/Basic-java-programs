package com.basic;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345,rem,sum=0;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println(sum);

	}

}
