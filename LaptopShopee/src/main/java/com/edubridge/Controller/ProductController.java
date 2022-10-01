package com.edubridge.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edubridge.beans.Product;
import com.edubridge.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	private static final String PRODUCT = "product";
	// Getters and Setters

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

////	Normal ProductList view 
//  @RequestMapping("/all.html") public ModelAndView getAllProducts() {
//  List<Product> products = productService.getAllProducts(); 
//  
//  return new ModelAndView("all", "products", products); }
  
	
	
	//		Normal ProductList view 
	  @RequestMapping(value = "/hp.html" , method = RequestMethod.GET) 
	  public ModelAndView getAllHpProducts() {
	  List<Product> products = productService.getAllHpProducts(); 
	  
	  return new ModelAndView("hp", "products", products); }

		//		Normal ProductList view 
	  @RequestMapping(value = "/dell.html" , method = RequestMethod.GET) 
		public ModelAndView getAllDellProducts( ) {
			  List<Product> products = productService.getAllDellProducts(); 
			// System.out.println(products.get(0).getProductBrand());
			  
			  return new ModelAndView("dell", "products", products); }
	  
		//		Normal ProductList view 
	  @RequestMapping(value = "/asus.html" , method = RequestMethod.GET) 
	  public ModelAndView getAllAsusProducts() {
	  List<Product> products = productService.getAllAsusProducts(); 

	  return new ModelAndView("asus", "products", products); }
}
