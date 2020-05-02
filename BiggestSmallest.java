package com.basic;

public class BiggestSmallest {

	public static void main(String[] args) {
		int[] arr= {23,3,1,0,-1,10};
		int temp=0;
		int i,j;
		/*for(int i=0;i<arr.length;i++) {
			
			System.out.print(" "+ arr[i]);
		}
		System.out.println("\n");*/
		
		//
for(i=0;i<arr.length;i++) {
			for(j=i+1;i<arr.length;i++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for( i=0;i<arr.length;i++) {
			System.out.print(" "+ arr[i]);
}
System.out.println("\n");


int max;
max=arr[0];
for(i=1;i<arr.length;i++) {
	if(arr[i]>max)
	max=arr[i];
}
System.out.println(max);


int min;
min=arr[0];
for(i=1;i<arr.length;i++) {
	if(arr[i]<min)
	min=arr[i];
}
System.out.println(min);

	}

}
