package com.besics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
//import java.io.*;
import java.util.Comparator;

public class Sortusingcomparator {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int n=Integer.parseInt(br.readLine());
		
		Integer arr[]=new Integer[n];
		System.out.println("Enter Integers :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		/*
		System.out.println("Elements before sorting");
		display(arr);
		Arrays.sort(arr);
		System.out.println("Elements after sorting");
		display(arr);
		
		*/
		
		Arrays.sort(arr,new Ascend());
		System.out.println("Elements in Ascending order :");
		display(arr);
		
		Arrays.sort(arr,new Descend());
		System.out.println("Elements in Descending order :");
		display(arr);
		
	}
	
	static void display(Integer arr[])
	{
		for(int i:arr) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
	}

}


class Ascend implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		return i1.compareTo(i2);
	}
}

class Descend implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		return i2.compareTo(i1);
	}
}