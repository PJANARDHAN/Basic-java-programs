package com.besics;

public class PassCommondLineArguments {

	public static void main(String[] args) {
		int length=args.length;
		System.out.println(length);
	/*	int a=Integer.parseInt(args[0]);
		System.out.println(a);
		or */ 
		
		
		String s=args[1];
		String c=args[2];
		System.out.println(args[0]);
		System.out.println(s);
		System.out.println(c);
	}

}
