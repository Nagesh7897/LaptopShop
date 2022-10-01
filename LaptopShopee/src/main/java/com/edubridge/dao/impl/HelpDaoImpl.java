package com.edubridge.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.beans.Help;
import com.edubridge.dao.HelpDao;
@Repository
public class HelpDaoImpl implements HelpDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void add(Help help) {
		// TODO Auto-generated method stub	
		sessionFactory.getCurrentSession().save(help);
	}
}
