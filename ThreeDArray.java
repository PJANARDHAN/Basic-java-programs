package com.besics;

public class ThreeDArray {

	public static void main(String[] args) {
		int arr[][][]= {{{60,65,75},{70,68,80}},{{90,80,69},{67,77,88}},{{86,68,78},{87,76,65}}};
		int total=0;
		for(int dept=0;dept<3;dept++)
		{
			System.out.println("Department "+ (dept+1) +":");
			for(int student=0;student<2;student++)
			{
				System.out.print("Student " +(student+1) +":");
				for(int marks=0;marks<3;marks++)
				{
					System.out.print(arr[dept][student][marks] +" ");
					total+=arr[dept][student][marks];
				}
				System.out.println("Total marks :" +total);
			}
		}
		
	}

}
