package com.besics;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows: ");
		int row=sc.nextInt();
		System.out.println("enter no of columns:");
		int col=sc.nextInt();
		
		int a[][]= new int[row][col];    //{{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("enter no's :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				 a[i][j] =sc.nextInt();
			}
			
		}
		
		
		sc.close();
		
		System.out.println("matrix is :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println(" transpose matrix is :");
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				
				System.out.print(a[j][i] +" ");
			}
			System.out.println();
		}
	}

}
