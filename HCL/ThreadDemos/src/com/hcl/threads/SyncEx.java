package com.hcl.threads;

class Data {
 	synchronized void dispMsg(String name) {
		System.out.print("Hello " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" How are u...");
	}
}

class Uttam extends Thread {
	Data d;
	Uttam(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.dispMsg("Uttam");
	}
}

class Laksh extends Thread {
	Data d;
	Laksh(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.dispMsg("Laksh");
	}
}

class Hema extends Thread {
	Data d;
	Hema(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.dispMsg("Hema");
	}
}
public class SyncEx {
	public static void main(String[] args) {
		Data d=new Data();
		Laksh obj1=new Laksh(d);
		Hema obj2=new Hema(d);
		Uttam obj3=new Uttam(d);
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
