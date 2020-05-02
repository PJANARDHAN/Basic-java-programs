package com.basic;

class a extends Thread
{
	
//performing multithreading using Thread class which we have to extand it
// which defaultly having run() method ,
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hai");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

class b extends Thread
{
	public void run() {
		for(int i=0;i<5;i++) {
	System.out.println("hello");
	try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}
public class Threading {

	public static void main(String[] args) {
		
		a c=new a();
		b d=new b();
		c.start();
		try { Thread.sleep(10);} catch(Exception e) {}
		d.start();
		
	}

}
