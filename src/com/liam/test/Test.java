package com.liam.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	private ApplicationContext acx = null;
	@org.junit.Test
	public void test() throws SQLException{
		acx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("shujuyuan:"+acx);
		DataSource dataSource = acx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection().toString());
		SessionFactory sessionFactory = acx.getBean(SessionFactory.class);
		System.out.println(sessionFactory);
	}
}
