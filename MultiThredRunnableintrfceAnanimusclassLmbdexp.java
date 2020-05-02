package com.basic;

public class MultiThredRunnableintrfceAnanimusclassLmbdexp {
public static void main(String[] args) {
//lambda expression of functional interface.
// performing multithreading using Runnable interface i e we have to implement
	
	

//after pasting code in place of obj1 object remove this whole Runnable reference.
	Runnable obj1=() -> {
				for(int i=0;i<5;i++) {
					System.out.println("hai");
					try { Thread.sleep(1000);} catch(Exception e) {}
				}
			}
		;
		
		
//after pasting code in place of obj2 object remove this whole Runnable reference.
		Runnable obj2= () -> {
				for(int i=0;i<5;i++) {
					System.out.println("hello");
					try { Thread.sleep(1000);} catch(Exception e) {}
				}
				
			}
		;
		
		Thread t1=new Thread(obj1);
//to make code more efficent we paste the code in place of obj1 object,
// in above expression that code is ... 
		/* () -> {
		for(int i=0;i<5;i++) {
			System.out.println("hai");
			try { Thread.sleep(1000);} catch(Exception e) {}
		}
	}*/
		
		Thread t2=new Thread(obj2);
//to make code more efficent we paste the code in place of obj2 object,
// in above expression that code is ... 
		/* () -> {
				for(int i=0;i<5;i++) {
					System.out.println("hello");
					try { Thread.sleep(1000);} catch(Exception e) {}
				}
				
			}*/


		t1.start();
		try { Thread.sleep(10);} catch(Exception e) {}
		t2.start();

	}
}
