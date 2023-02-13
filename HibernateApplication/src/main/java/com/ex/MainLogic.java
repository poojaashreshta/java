package com.ex;


import org.hibernate.Session;

import org.hibernate.Transaction;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session se=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=se.beginTransaction();
		
		College shraddha=new College(); 
		shraddha.setSid(432);
		shraddha.setSname("shan");
		shraddha.setSmarks(300);
		shraddha.setSection("B");
		shraddha.setBranch("IT");
		
		se.save(shraddha); 
		tx.commit(); 
		
	}

}
