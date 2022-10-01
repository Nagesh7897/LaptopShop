package com.edubridge.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.beans.Product;
import com.edubridge.dao.ProductDao;

@Repository(value = "productDao")
public class ProductDaoImpl implements ProductDao {

	// this class is wired with the sessionFactory to do some operation in the
	// database

	@Autowired
	private SessionFactory sessionFactory;

	// this will create one sessionFactory for this class
	// there is only one sessionFactory should be created for the applications
	// we can create multiple sessions for a sessionFactory
	// each session can do some functions
//
//@SuppressWarnings("unchecked")
//@Override
//	public List<Product> getAllProducts() {
//		// Reading the records from the table
//	return sessionFactory
//			.getCurrentSession()
//			.createQuery(
//					"from Product")
//			.list();
//	}

@SuppressWarnings("unchecked")
@Override
public List<Product> getAllHpProducts() {
	// TODO Auto-generated method stub
	return  sessionFactory
			.getCurrentSession()
			.createQuery(
					"from Product WHERE productBrand = :Brand").setParameter("Brand", "HP")
			.list();
}

@SuppressWarnings("unchecked")
@Override
public List<Product> getAllDellProducts() {
	// TODO Auto-generated method stub
	return  sessionFactory
			.getCurrentSession()
			.createQuery(
					"from Product WHERE productBrand = :Brand").setParameter("Brand", "DELL")
			.list();
}

@SuppressWarnings("unchecked")
@Override
public List<Product> getAllAsusProducts() {
	// TODO Auto-generated method stub
	return  sessionFactory
			.getCurrentSession()
			.createQuery(
					"from Product WHERE productBrand = :Brand").setParameter("Brand", "ASUS")
			.list();
}
}



