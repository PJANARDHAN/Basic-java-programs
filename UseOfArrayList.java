package com.besics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UseOfArrayList {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int id;
		String name,address;
		
		ArrayList<Employe1> ar1=new ArrayList<>();
		
		System.out.println("Enter How many employees details want to store :");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Employee id  :\t"); 
			id=Integer.parseInt(br.readLine());
			
			System.out.print("Enter Employee name :\t");
			name=br.readLine();
			
			System.out.print("Enter Employee Address:\t");
			address=br.readLine();
			
			Employe1 obj=new Employe1(id, name, address);
			ar1.add(obj);
			obj.display();
		}
		
	

	}

}

class Employe1
{
	int id;
	String name,address;
	Employe1(int i,String n,String a)
	{
		id=i;
		name=n;
		address=a;
	}
	
	public void display()
	{
		System.out.println("-------------------------------");
		System.out.println("Employee Detais :");
		System.out.println("Employee id :" +id);
		System.out.println("Employee name :" +name);
		System.out.println("Employee Address :" +address);
		System.out.println("--------------------------------");
	}
}