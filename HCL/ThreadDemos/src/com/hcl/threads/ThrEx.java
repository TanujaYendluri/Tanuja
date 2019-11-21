package com.hcl.threads;

class Even extends Thread {
	@Override
	public void run() {
		for(int i=0;i<20;i+=2) {
			System.out.println("Even  " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Odd extends Thread {
	@Override
	public void run() {
		for(int i=1;i<20;i+=2) {
			System.out.println("Odd  " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Fact extends Thread {
	@Override
	public void run() {
		int f=1;
		for(int i=1;i<=8;i++) {
			f=f*i;
			System.out.println("Factorial  " +f);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThrEx {
	public static void main(String[] args) {
		Even obj1=new Even();
		Odd obj2=new Odd();
		Fact obj3=new Fact();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		Thread t3=new Thread(obj3);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t3.start();
	}
}
