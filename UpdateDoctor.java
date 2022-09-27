package com.entityD;

import java.util.Scanner;


import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdateDoctor 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  DoctorClass d=(DoctorClass)session.get(DoctorClass.class,"1001");
		  System.out.println("Enter the update data:");
		  d.setDname(sc.next());
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();
		 }
}
