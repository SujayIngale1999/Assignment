package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_DAO 
{
	public static void main(String[] args) 
	{
	
		Employee_DAO.insert_data();
	}
	
	
	
	public static void insert_data()
	{
		try
		{
			HibernateUtil.getSessionFactory().openSession();
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Employee emp = new Employee();
			emp.setSl_no(3);
			emp.setEmployee_name("rah");
			emp.setMibil_no("46475883");
			//emp.getContenctType();
			session.save(emp);
			transaction.commit();
			session.close();
			sessionFactory.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
	public static void update()
	{
		try
		{
			HibernateUtil.getSessionFactory().openSession();
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Employee emp = new Employee();
			
			emp.setSl_no(3);
			emp.setEmployee_name("pavn");
			emp.setMibil_no("98574783");
			session.update(emp);
			System.out.println(emp.getEmployee_name());
			

			//emp.getContenctType();
			//session.update(emp);
			transaction.commit();
			session.close();
			sessionFactory.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
	public static void delete()
	{
		try
		{
			HibernateUtil.getSessionFactory().openSession();
			SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Employee emp = new Employee();
			
			emp.setSl_no(3);
			
			session.delete(emp);
			System.out.println(emp.getEmployee_name());
			

			//emp.getContenctType();
			//session.update(emp);
			transaction.commit();
			session.close();
			sessionFactory.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}
