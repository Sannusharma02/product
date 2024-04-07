package com.oehm3.basics.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oehm3.basics.dto.Brand;
import com.oehm3.basics.dto.Company;
import com.oehm3.basics.dto.Movies;
import com.oehm3.basics.dto.Question;

public class AssosiationsDao {
	
	public void saveCompanyDetails(Company company) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(company);
			transaction.commit();
		}catch (HibernateException e) {
			System.err.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
	public void saveBrandDetails(Brand brand) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
		session.save(brand);
		transaction.commit();
		}
		catch (HibernateException e) {
			System.err.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
	public void saveMovieDetails(Movies movies) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(movies);
			transaction.commit();
		}catch (HibernateException e) {
			System.err.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
	
	public void saveQuestionAndAnswerDetails(Question question) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(question);
			transaction.commit();
		}catch (HibernateException e) {
			System.err.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
}