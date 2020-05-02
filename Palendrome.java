package com.basic;
//Prime number checking program
import java.util.Scanner;

/*public class Palendrome {
	
	public static void main(String[] args) {
		System.out.println("enter integer number\n");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					System.out.println(num+" is not prime");
					return;
				}
				}
				System.out.println(num+ " is prime");
		}
}*/


//Palendrome number program
import java.util.Scanner;
class Palendrome{
	 public static void main(String args[]){
	  int r,sum=0,temp;  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter palendrome number");
	  int n=sc.nextInt(); 
	  temp=n;  
	  while(n>0){  
	   r=n%10;  //getting remainder
	   sum=(sum*10)+r;  
	   n=n/10;  
	  }  
	  System.out.println(sum);
	  if(temp==sum)  
	   System.out.println("palindrome number ");  
	  else  
	   System.out.println("not palindrome");  
	}
	}


/*
import java.util.*; 
class Palendrome
{
   public static void main(String args[])
   {
      String original, reverse = ""; // Objects of String class
      Scanner in = new Scanner(System.in); 
      System.out.println("Enter a string/number to check if it is a palindrome");
      original = in.nextLine(); 
      int length = original.length(); 
      for ( int i = length - 1; i >= 0; i-- )
         reverse = reverse + original.charAt(i);
      if (original.equals(reverse))
         System.out.println("Entered string/number is a palindrome.");
      else
         System.out.println("Entered string/number isn't a palindrome."); 
   }
}*/
