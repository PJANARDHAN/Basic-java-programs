package com.basic;

public class MinMaxElementInArray {

	public static void main(String[] args) {
		int a[]= {99,0,101,-2,2,47,57,35,10};
		
		System.out.println("max element in array is " + maxvalue(a));
		System.out.println("min element in array is " + minvalue(a));
	}


public static int maxvalue(int a[]) {
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(max<a[i]) {
		max=a[i];}
	}
	return max;
}
public static int minvalue(int a[]) {
	int min=a[0];
	for(int i=0;i<a.length;i++) {
		if(min>a[i]) {
		min=a[i];}
	}
	return min;
}
}