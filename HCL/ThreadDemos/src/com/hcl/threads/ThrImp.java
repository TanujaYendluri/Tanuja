package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable {
	@Override
	public void run() {
		List lstData=new ArrayList();
		lstData.add("Keerthana");
		lstData.add("Yash");
		lstData.add("Amit");
		lstData.add("Raghu");
		lstData.add("Sai");
		lstData.add("Krishna");
		
		for (Object object : lstData) {
			System.out.println("List " +object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class LinkDemo implements Runnable {
	@Override
	public void run() {
		LinkedList lst=new LinkedList();
		lst.add("Bindu");
		lst.add("Visalakshi");
		lst.add("Anubhav");
		lst.add("Janani");
		lst.addFirst("Tarun");
		lst.addLast("Kiruba");
		for (Object object : lst) {
			System.out.println("Linked List " +object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class VectorDemo implements Runnable {
	@Override
	public void run() {
		Vector v=new Vector(3,2);
		v.addElement("Niveda");
		v.addElement("Yashwanth");
		v.addElement("Sai Krishna");
		v.addElement("Prem Reddy");
		v.addElement("Anisha");
		v.addElement("Nagindra");
		for (Object object : v) {
			System.out.println("Vector " +object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThrImp {
	public static void main(String[] args) {
		Thread t1=new Thread(new ListDemo());
		Thread t2=new Thread(new LinkDemo());
		Thread t3=new Thread(new VectorDemo());
		
		t1.start();  
		t2.start(); 
		t3.start();
	}
}
