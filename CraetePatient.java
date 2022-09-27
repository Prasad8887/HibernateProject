package com.entity;

import java.util.Scanner;


import com.utility.HibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CraetePatient 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PatientClass p=new PatientClass();
		System.out.println("Enter the Patient ID:");
		p.setPid(sc.nextInt());
		System.out.println("Enter the Patient Name:");
		p.setName(sc.next());
		System.out.println("Enter the Patient Birthdate:");
		p.setBirthdate(sc.next());
		System.out.println("Enter the Patient Gender:");
		p.setGender(sc.next());
		System.out.println("Enter the Patient Mobile Number:");
		p.setMobileNo(sc.nextLong());
		System.out.println("Enter the Patient Address:");
		p.setAddress(sc.next());
		System.out.println("Enter the Patient Blood group:");
		p.setBloodGroup(sc.next());
		System.out.println("Enter the Patient Diseases:");
		p.setDiseases(sc.next());
		System.out.println("Enter the Patient Medicine Allergy:");
		p.setMedicineAllergy(sc.next());
		System.out.println("Enter the Patient doctor ID whose Handled Patient:");
		p.setDoctorId(sc.next());
		
		
		//Create session factory object
		  SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		  //getting session object from session factory
		  Session session = sessionFactory.openSession();
		  //getting transaction object from session object
		  session.beginTransaction();
		  
		  session.save(p);
		  System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

}
}