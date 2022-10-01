package com.edubridge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edubridge.beans.Cart;
import com.edubridge.beans.Product;
import com.edubridge.dao.CartDao;
import com.edubridge.service.CartService;

@Service(value="cartService")
public class CartServiceImpl implements CartService{

	@Autowired
	private CartDao cartDao;
	
	@Transactional
	public CartDao getCartDao() {
		return cartDao;
	}
	
	@Transactional
	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}


	@Transactional
	public List<Product> getCartProducts() {
		// TODO Auto-generated method stub
		return cartDao.getCartProducts();
	}

	@Transactional
	public int getCountProducts(Integer prodId) {
		return cartDao.getCountProducts(prodId);
	}

	@Transactional
	public List<Product> getDelete(Integer prodId) {
		// TODO Auto-generated method stub
		return cartDao.getDelete(prodId);
	}

//	@Transactional
//	public int getCheckProducts(Integer prodId, Cart cart) {
//		// TODO Auto-generated method stub
//		return cartDao.getCheckProducts(prodId, null);
//	}
//	
	

}
