package com.basic;

public class ExceptoinHandling {

	public static void main(String[] args) {
		
		try
		{
		int arr[]= new int[5];
		System.out.println(arr[4]=8);
		
		int arr1[]=null;
		//arr1[0]=4;
		
		int a=4;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		
		/*catch(Exception e)		// please don't write " catch(Exception e) " first only,
		{							// because it is only taking all exceptions
		
			System.out.println("Error");
		}*/
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Array Index Out Of Bounds Exception");
		}
		
		catch(ArithmeticException e)
		{
			System.err.println("Arithmetic Exception error");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception error ");
		}
	}

}
