package com.oehm3.basics.utils;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator{

	@Override
	public Serializable generate(SharedSessionContractImplementor arg0, Object arg1) throws HibernateException {
		
		return new Long(151);
	}

}
