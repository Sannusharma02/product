package com.oehm3.basics.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.oehm3.basics.dto.Product;


public class HqlProductDao {
	
	public void updateProductPriceByName(String name, Double price) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction =session.beginTransaction();
		String hql = "update Product set price=:newPrice where name =:name";
		Query query = session.createQuery(hql);
		query.setParameter("newPrice", price);
		query.setParameter("name", name);
		int rowsUpdated = query.executeUpdate();
		transaction.commit();
		System.out.println("total number of rows epdated -->"+rowsUpdated); 
	}

	public List<Product> getProducts() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hqlString = "from Product";
		Query query = session.createQuery(hqlString);
		List<Product> products = query.list(); 
		return products;
	}
	
	public Product getProductByName(String empName) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hqlString = "from Product where name=name";
		Query query = session.createQuery(hqlString);
		query.setParameter("name", empName);
		Product product = (Product) query.uniqueResult();
		return product;
	}
}
