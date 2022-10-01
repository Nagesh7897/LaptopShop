package com.edubridge.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.Is;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.Controller.Commands;
import com.edubridge.beans.Cart;
import com.edubridge.beans.Product;
import com.edubridge.dao.CartDao;

@Repository(value = "cartDao")
public class CartDaoImpl implements CartDao {
	@Autowired
	private SessionFactory sessionFactory;


	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getCartProducts() {
		String email=Commands.emailId;
		System.out.println(email);
		
		List<Integer> id =new ArrayList<Integer>();
		id=sessionFactory
				.getCurrentSession()
				.createQuery(
						"Select productId from Cart WHERE emailId= : email").setParameter("email", email)
				.list();
		System.out.println(id);
		return  sessionFactory
				.getCurrentSession()
				.createQuery(
						"from Product WHERE productId in (:Id)").setParameter("Id", id)
				.list();
	}

	
	@Override
	public int getCountProducts(Integer prodId) {
		
		
		String email=Commands.emailId;
		
Query query=sessionFactory
.getCurrentSession()
.createQuery(
		"Update Cart set quantity= quantity + 1 Where productId= :productId and emailId= : email");
		query.setParameter("productId", prodId);
		query.setParameter("email", email);
		Integer count=query.executeUpdate();
		return count;
		
//		com.mysql.cj.Query quantity =(com.mysql.cj.Query) sessionFactory
//				.getCurrentSession()
//				.createQuery(
//						"Select quantity from Cart Where productId= prodId and emailId=  email");
//					int quantity1= query.executeUpdate();

	}
	
//	@SuppressWarnings("deprecation")
//	@Override
//	public int getCheckProducts(Integer prodId, Cart cart) {
//		Integer check=0;
//		String email=Commands.emailId;
//		
//		Query query=sessionFactory
//		.getCurrentSession()
//		.createQuery(
//				"SELECT count(*) FROM Cart Where productId= :productId and emailId= : email");
//				query.setParameter("productId", prodId);
//				query.setParameter("email", email);
//				Integer count=query.executeUpdate();
//				System.out.println("This Is count="+ count);
//		return count;
//	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getDelete(Integer prodId) {
		String email=Commands.emailId;
		System.out.println(email);

		sessionFactory
		.getCurrentSession()
		.createQuery(
				"delete from Cart WHERE emailId= :email AND productId= :Id").setParameter("email", email).setParameter("Id", prodId).executeUpdate();
		
		List<Integer> id =new ArrayList<Integer>();
		id=sessionFactory
				.getCurrentSession()
				.createQuery(
						"Select productId from Cart WHERE emailId= : email").setParameter("email", email)
				.list();
	System.out.println(id);
		
		
		return sessionFactory
				.getCurrentSession()
				.createQuery(
						"from Product WHERE productId in (:Id)").setParameter("Id", id)
				.list();
	}



}
