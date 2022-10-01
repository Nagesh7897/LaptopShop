package com.edubridge.service;

import java.util.List;

import com.edubridge.beans.Cart;
import com.edubridge.beans.Product;

public interface CartService {
	
	public List<Product> getCartProducts();

	public List<Product> getDelete(Integer prodId);

	public int getCountProducts(Integer prodId);

//	public int getCheckProducts(Integer prodId, Cart cart);
}
