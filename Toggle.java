package com.basic;

import java.util.Scanner;

public class Toggle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		char str[]=a.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]>='A'&& str[i]<='Z')
			{
				str[i]=(char)((int)str[i]+32);
			}
			else if(str[i]>='a'&& str[i]<='z')
			{
				str[i]=(char)((int)str[i]-32);
			}
		}
		System.out.println(str);
		//for(int i=0;i<str.length;i++) {
		//System.out.print(str[i]);}
	}

}
