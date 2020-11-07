package com.besics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,Long> hm=new HashMap<>();
		String name,str;
		Long phno;
		
		while(true)
		{
			System.out.println("1. Enter Contact Details :");
			System.out.println("2. Search contact no using name :");
			System.out.println("3. view all names of contact ");
			System.out.println("4. Exit");
			
			int n=Integer.parseInt(br.readLine());
			switch(n)
			{
			case 1:
				System.out.println("enter name :");
				name=br.readLine();
				System.out.println("enter phno :");
				str=br.readLine();
				phno=new Long(str);
				hm.put(name, phno);
				break;
				
			case 2:
				System.out.println("enter name");
				name=br.readLine();
				name=name.trim();
				phno=hm.get(name);
				System.out.println(phno);
				break;
				
			case 3:
				Set<String> hs=new HashSet<>();
				hs=hm.keySet();
				System.out.println(hs);
				break;
				
			case 4:return;
			}
		}
	}

}
