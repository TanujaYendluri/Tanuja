package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmploySearch {
	public Employ searchEmploy(int empno){
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Query q=s.createQuery("from Employ where Empno="+empno);
		List list= q.list();
		Employ e=null;
		for(Object ob:list){
			e = (Employ)ob;
		}
		return e;
	}
}
