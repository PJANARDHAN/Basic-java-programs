package com.basic;

public class MultiThrdJoinIsaliveMethod  {

	public static void main(String[] args)  throws Exception{
		
		Thread t1=new Thread(() -> {
			for(int i=1;i<=5;i++) {
				System.out.println("hai " + Thread.currentThread().getPriority());
				try { Thread.sleep(1000);} catch(Exception e) {}
			}
		} ,"Hai thread");
		//to make code more efficent we paste the code in place of obj1 object,
		// in above expression that code is ... 
				/* () -> {
				for(int i=0;i<5;i++) {
					System.out.println("hai");
					try { Thread.sleep(1000);} catch(Exception e) {}
				}
			}*/
				
				Thread t2=new Thread(() -> {
					for(int i=1;i<=5;i++) {
						System.out.println("hello ");
						try { Thread.sleep(1000);} catch(Exception e) {}
					}
					
				},"Hello thread");
		//to make code more efficent we paste the code in place of obj2 object,
		// in above expression that code is ... 
				/* () -> {
						for(int i=0;i<5;i++) {
							System.out.println("hello");
							try { Thread.sleep(1000);} catch(Exception e) {}
						}
						
					}*/


				System.out.println(Thread.MIN_PRIORITY);
				System.out.println(Thread.MAX_PRIORITY);
				t1.start();
				try { Thread.sleep(10);} catch(Exception e) {}
				t2.start();
				
				
//that means thread still running 
				System.out.println(t1.isAlive());
				
				
//to handle this join we have to maintain ThrowsExption.
				t1.join(); 
				t2.join();
			
				
//here thread is complted its running 
// so thats why its printing false at last.
				System.out.println(t1.isAlive());
				t2.isAlive();
				
//join ,isalive() these method not there means the main thread will execute,
// this print statement at middle of execution
				System.out.println("bye");

			}

}
