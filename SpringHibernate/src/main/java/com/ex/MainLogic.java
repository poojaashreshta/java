package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		SpringORM s=ac.getBean(SpringORM.class);
		College c=new College();
		c.setSid(1046);
		c.setSname("Mark");
		c.setSmarks(654);
		c.setSection("A");
		c.setBranch("CSE");
		s.insert(c);
	}

}