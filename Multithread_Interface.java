package com.basic;

class hai implements Runnable{
//performing multithreading using Runnable interface ,which we have to implement,
	// which defaultly having run() method ,
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("hai");
		try { Thread.sleep(1000);} catch(Exception e) {}
	}
	}
}

class hello implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("hello");
		try { Thread.sleep(1000);} catch(Exception e) {}
	}
	}
}


public class Multithread_Interface {

	public static void main(String[] args) {
		Runnable obj1=new hai();
		Runnable obj2=new hello();
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try { Thread.sleep(10);} catch(Exception e) {}
		t2.start();
	}

}
