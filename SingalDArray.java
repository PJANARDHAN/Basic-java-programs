package com.besics;
//Bobble Sort algoritham
public class SingalDArray {

	public static void main(String[] args) {
		
		int arr[]= {8,7,9,10,2,1,5};
		//boolean swapped =true;
		
		for(int i=0;i<arr.length-1;i++)
		{
			//boolean swapped =false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			//	swapped=true;
			}
			}
		}
		//if(swapped==false) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//}
	}

}
