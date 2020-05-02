package com.basic;
@FunctionalInterface
interface demo
{
	void show();	//declaring methods but cannot define the methods but,
	default void abc() {		//using default keyword we can define the method in interface
		System.out.println("i am in demo abc");
	}
}

interface mydemo
{
	default void abc() {	
		System.out.println("i am in mydemo abc");
	}
}

class main implements demo,mydemo{  //here multiple inheritence is achived in java1.8 using functional interface
									// another name called ambugety or multiple inheritence achived
	public void show() {
		System.out.println("i am show");
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		demo.super.abc();	//to call defined method in demo interface
		mydemo.super.abc();		// to call defined method in mydemo interface
	}
	
}


public class MultipleInheritenceIssueWithInterface {

	public static void main(String[] args) {
		demo obj=new main();
		obj.abc();
		obj.show();

	}

}
