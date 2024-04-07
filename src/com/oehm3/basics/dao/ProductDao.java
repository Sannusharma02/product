package com.oehm3.basics.dao;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

//import com.oehm3.basics.dao.ProductDao;
import com.oehm3.basics.dto.Product;

public class ProductDao {
	
	public void saveProduct(Product product) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
		session.save(product);
		transaction.commit();
		}catch (HibernateException e) {
			System.err.println(e);
		}finally {
			session.close();
			sessionFactory.close();
		}
	}
	
	public Product getProduct(Long id) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Product product = session.get(Product.class, id);
		return product;
	}
	
	public void deleteById(Long id) {
		Product product = getProduct(id);
		if(product!=null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(product);
			transaction.commit();
		}
		
	}
	
}