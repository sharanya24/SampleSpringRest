package com.cultuzz.accounting.dao;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.cultuzz.accounting.factory.BeanFactory;


public abstract class AbstractDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	private BeanFactory beanFactory;

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	@Autowired
	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}
	
	public Session getReadSession(){
		return sessionFactory.getCurrentSession();
	}

}
