package com.basic;

//import java.util.Scanner;

public class ArrayEllementsSum {

	public static void main(String[] args) {
		int sum=0,i;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements want to enter");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter all elements");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("array of sum is"+sum);
	}*/
	
	//int sum=0,i;
	int a[]= {2,3,4,5,6,7,8};
	for(i=0;i<a.length;i++)
		sum+=a[i];
		System.out.println(sum);
}}