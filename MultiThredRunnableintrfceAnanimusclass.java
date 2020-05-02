package com.basic;

public class MultiThredRunnableintrfceAnanimusclass {

	public static void main(String[] args) {
		
//performing multithreading using ananimous class in constructor ,
// by using Runnable interface ,which we have to implement,
// which defaultly having run() method ,
		Runnable obj1=new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("hai");
					try { Thread.sleep(1000);} catch(Exception e) {}
				}
			}
		};
		
		
		Runnable obj2=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("hello");
					try { Thread.sleep(1000);} catch(Exception e) {}
				}
				
			}
		};
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try { Thread.sleep(10);} catch(Exception e) {}
		t2.start();

	}

}
