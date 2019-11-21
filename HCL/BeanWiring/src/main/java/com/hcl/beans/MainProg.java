package com.hcl.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {

	public static void main(String[] args) {
		ApplicationContext ctx=
	new ClassPathXmlApplicationContext("wire.xml");
		Faculty f=(Faculty)ctx.getBean("faculty");
		f.teaching();
	}
}
