package com.edubridge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edubridge.beans.Product;
import com.edubridge.dao.ProductDao;
import com.edubridge.service.ProductService;

@Service(value="productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	@Transactional
	public ProductDao getProductDao() {
		return productDao;
	}
	@Transactional
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

//	@Transactional
//	public List<Product> getAllProducts() {
//		return productDao.getAllProducts();
//	}
	
	@Transactional
	public List<Product> getAllHpProducts() {
		return productDao.getAllHpProducts();
	}
	
	@Transactional
	public List<Product> getAllDellProducts() {
		return productDao.getAllDellProducts();
	}

	@Transactional
	public List<Product> getAllAsusProducts() {
		return productDao.getAllAsusProducts();
	}

}
