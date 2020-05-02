package com.basic;

class counter{
	int count;
	public synchronized void increment() // here we have to mention synchronized,
	{										// to count accurate values
		count++;
	}
	
}


public class AsynTskMultiThreading {

	public static void main(String[] args) throws Exception{
		counter c=new counter();
	//c.increment();//it can be done by using threads below shown in run method
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
				c.increment();
				}
			}
		});
		
		
Thread t2=new Thread(new Runnable() {
	
			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
				c.increment();
				}
			}
		});
		
		
		t1.start();
		t2.start();
		t1.join(); 
		t2.join();
		System.out.println("count " + c.count);
	}
}
