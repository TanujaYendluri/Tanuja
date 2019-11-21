package com.hcl.jsp;

public class Mains {

	static {
		System.out.println("HCL");
	}
	{
		System.out.println("Bl");
	}
	Mains() {
		System.out.println("ATB");
	}
	public static void main(String[] args) {
		new Mains();
	}
}
