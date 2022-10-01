package com.edubridge.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.edubridge.beans.Cart;
import com.edubridge.beans.Product;
import com.edubridge.service.CartService;

@Controller 
public class CartController {
	
    @Autowired
    private CartService cartService;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public CartService getCartService() {
		return cartService;
	}

	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Transaction transaction;
	private static final String CART = "cart";
	private static final String PRODUCT = "product";
	
	@RequestMapping(value = "/productId.html", method = RequestMethod.GET)
    public String addProduct(@RequestParam(value = "productId") String prod, 
    	@ModelAttribute(CART) Cart cart,ModelMap modelMap) {
		 Session session2= sessionFactory.openSession();
           transaction = session2.beginTransaction();
      System.out.println(prod);          // id is coming as a string
      Integer prodId= Integer.parseInt(prod);
      
 //     int checkInCart=  cartService.getCheckProducts(prodId , cart);
      
 // int quantity=  cartService.getCountProducts(prodId);

   cart.setEmailId(Commands.emailId);
	    cart.setProductId(prodId);
	    cart.setQuantity(1);
         session2.save(cart); 
	 	session2.getTransaction().commit();
	 	modelMap.addAttribute("Useremail", Commands.emailId);
	  return "indexlogged";
	}
	
//	@RequestMapping(value = "/cartcount.html" , method = RequestMethod.GET)
	//public String getCountProducts(Model model) {
//		cartService.getCountProducts(prodId);  
//		  model.addAttribute("Useremail", Commands.emailId);                  ......
//		  return "indexlogged";
	//}

@RequestMapping(value = "/cart.html" , method = RequestMethod.GET) 
public ModelAndView getCartProducts(Model model) {
	  List<Product> products = cartService.getCartProducts();
	  model.addAttribute("Useremail", Commands.emailId);
	 return new ModelAndView("cart", "products", products);
}




@RequestMapping(value = "/delete.html" , method = RequestMethod.GET)  
public ModelAndView getDelete(@RequestParam(value = "productId") String prod, 
    	@ModelAttribute(CART) Cart cart,ModelMap modelMap) {
	 Session session2= sessionFactory.openSession();
     transaction = session2.beginTransaction();
    System.out.println(prod);          // id is coming as a string
      
    int prodId= Integer.parseInt(prod);
	  List<Product> products = cartService.getDelete(prodId);
	  modelMap.addAttribute("Useremail", Commands.emailId);
	  return new ModelAndView("cart", "products", products);
}

@RequestMapping(value = "/customerdetails.html" , method = RequestMethod.GET)  
public String CustomerDetails(Model model){  
	model.addAttribute("Useremail", Commands.emailId);
	return "customerorderinfo"; 
}
}