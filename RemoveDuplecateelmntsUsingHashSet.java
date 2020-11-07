package com.besics;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplecateelmntsUsingHashSet {
	public static void main(String args[]) 
	{
		List<Integer> list1=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements wants to enter :");
		int n=sc.nextInt();
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
		int a=sc.nextInt();
		list1.add(a);}
		HashSet< Integer> set=new HashSet<Integer>(list1);
		List<Integer> list2=new ArrayList<Integer>(set);
		System.out.println("List after removing duplicate elements :");
		for(Object ob:list2)
			System.out.print(ob +" ");
}
}
