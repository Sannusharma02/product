package com.oehm3.basics.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.oehm3.basics.dto.Product;

public class SqlProductDao {

	public List<Object> getProducts() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String sql = "select * from product";
		Query query = session.createSQLQuery(sql);
		List<Object> list = query.list();
		return list;
	}
}
