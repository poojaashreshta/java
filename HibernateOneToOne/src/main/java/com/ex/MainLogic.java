package com.ex;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {
	
	public static void main(String[] args) { 
		Configuration cf=new Configuration(); 
		cf.configure("hibernate.xml"); 
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student shreshta=new Student(); 
		shreshta.setSid(111);
		shreshta.setSname("shreshta");
		shreshta.setSmarks(421);
		Address a =new Address(); 
		a.setAid(101);
		a.setPlace("Delhi");
		a.setSt(shreshta);
		
		se.save(a);
		tx.commit(); 
	}

}
