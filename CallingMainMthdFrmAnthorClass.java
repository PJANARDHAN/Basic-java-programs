package com.besics;

class CallingMainMthdFrmAnthorClass {

	public static void main(String[] args) {
		//for each loop
		for(String s:args)
		{
			System.out.println(s);
		}
	}

}

class Calling{
	public static void main(String[] args) {
		String arr[]= {"janardhan","Nischal","Nandeesh","Shreyas","Samarth","Ranjith","Shashank"};
		
		CallingMainMthdFrmAnthorClass.main(arr);
	}
}