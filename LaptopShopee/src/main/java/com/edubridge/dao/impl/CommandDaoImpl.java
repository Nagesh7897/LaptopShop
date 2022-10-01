package com.edubridge.dao.impl;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.Controller.Commands;
import com.edubridge.beans.Signin;
import com.edubridge.dao.CommandsDao;

@Repository
public class CommandDaoImpl implements CommandsDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void signin(Signin signin) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(signin);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void updatepassword(String pass) {
		String email=Commands.emailId;
	
	Query qa = sessionFactory
			.getCurrentSession()
			.createQuery(
					"UPDATE Signin set confirmPassword= :confirmPassword , password= :password   WHERE email = :email");
	qa.setParameter("confirmPassword", pass);
	qa.setParameter("email", email);
	qa.setParameter("password", pass);	
		int rowNo= qa.executeUpdate();
		System.out.println(rowNo);
		
		
		
	}

}
