package com.basic;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int a[]= {2,3,25,20,40,25,40,25};
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				count++;
			}
		}System.out.println(count);

	}

}
