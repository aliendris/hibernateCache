package com.hibernateCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateCacheApplication.class, args);
		
		
		
		Student student = null;
		Configuration confg = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = confg.buildSessionFactory();
		
		Session session1 = sf.openSession();
	    session1.beginTransaction();
	    student = (Student)session1.get(Student.class, 1);
	    System.out.println(student);
	    session1.getTransaction().commit();
	    session1.close();
	    
	    Session session2 = sf.openSession();
	    session2.beginTransaction();
	    student = (Student)session2.get(Student.class, 2);
	    System.out.println(student);
	    session2.getTransaction().commit();
	    session2.close();
	}

}
