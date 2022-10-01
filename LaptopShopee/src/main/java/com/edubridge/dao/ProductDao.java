package com.edubridge.dao;

import java.util.List;

import com.edubridge.beans.Product;

public interface ProductDao {
	

	//List<Product> getAllProducts();
	List<Product> getAllHpProducts();
	List<Product> getAllDellProducts();
	List<Product> getAllAsusProducts();

	
}
