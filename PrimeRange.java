package com.basic;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		int l,u,flag,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lower limit");
		l=sc.nextInt();
		System.out.println("enter upper limit");
		u=sc.nextInt();
		
		for(i=l;i<=u;i++)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					flag=1;
				break;
			}
			
		if(flag==0)
		{
			System.out.print(i+" ");
		}
		}
	}

}
