package com.hcl.threads;

class TableShow {
	void show(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p=n*i;
			System.out.println(n + " * " +i+ " = "+p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Tab1 extends Thread {
	TableShow t;
	Tab1(TableShow t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.show(12);
	}
}

class Tab2 extends Thread {
	TableShow t;
	Tab2(TableShow t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.show(5);
	}
}

class Tab3 extends Thread {
	TableShow t;
	Tab3(TableShow t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.show(19);
	}
}
public class MTabDemo {
	public static void main(String[] args) {
		TableShow t=new TableShow();
		Thread t1=new Thread(new Tab1(t));
		Thread t2=new Thread(new Tab2(t));
		Thread t3=new Thread(new Tab3(t));
		
		t1.start(); 
		t2.start(); 
		t3.start();
	}
}
