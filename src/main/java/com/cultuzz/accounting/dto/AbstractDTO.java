package com.cultuzz.accounting.dto;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.cultuzz.accounting.factory.BeanFactory;

public class AbstractDTO {
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
	
	public Session getWriteSession(){
		return sessionFactory.getCurrentSession();
	}
}
