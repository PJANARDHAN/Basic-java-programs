package com.basic;

interface Writer {
	public abstract void write(); //public abstract is defaultly is there in interface, interface is like a abstract class,
									//we cannot define method but in abstract  methodes defining ,we cannot create object of interface,
									// to create reference of interface is possible,but to create an object of interface is not possible, 
}
class pen implements Writer         
{									
	public void write() {
		System.out.println("I am Pen");
	}
}

class pencil implements Writer
{
	public void write() {
		System.out.println("I am pencil");
	}
}

class Kit{
	public void dosomething(Writer p) {
		p.write();
	}
}




public class InterfaceMain {

	public static void main(String[] args) {
		Kit k =new Kit();
		Writer p=new pen();				//so create an object of interface we need to create a class which implements the interface using implements
		Writer pc=new pencil();			//then we can call the methods.
		k.dosomething(p);

	}

}
