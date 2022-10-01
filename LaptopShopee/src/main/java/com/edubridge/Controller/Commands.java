package com.edubridge.Controller;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubridge.beans.Signin;
import com.edubridge.service.CommandsService;

@Controller  
public class Commands {

	@Autowired
	private CommandsService commandsService;
	
	@Autowired
	private SessionFactory sessionFactory;

	private static final String SIGNIN = "signin";
	Transaction transaction;

	
	public static String emailId;            //To share this in all methods (indexlogged.html)  
	
	  @RequestMapping(value = "/signin.html" , method = RequestMethod.GET)  
	    public String signin(Model m){  
	    	return "signin"; 
	    }
	  
	    @RequestMapping(value = "/login.html" , method = RequestMethod.GET)  
	    public String login(Model m){  
	    	
	    	return "login"; 
	    }
	  
	    @RequestMapping(value = "/index.html" , method = RequestMethod.GET)  
	    public String index(Model m){  
	    	
	    	return "index"; 
	    }
	    
	    @RequestMapping(value = "/signup.html" , method = RequestMethod.POST)  
	    public String signup(@ModelAttribute(SIGNIN) Signin signin, 
	    		HttpSession session, Model model) {
	    	
	    	commandsService.signin(signin);
	    	
//	    	session.setAttribute(SIGNIN, signin);
//	    	sessionFactory.openSession().save(signin);
//	    	model.addAttribute(SIGNIN, signin);
//	    	sessionFactory.close();
					return "login";
	    }
	    
	    @RequestMapping(value = "/indexlogged.html" , method = RequestMethod.GET)  
	    public String indexlogged(@ModelAttribute(SIGNIN) Signin login, 
	    		HttpSession session, Model model){  
	    	model.addAttribute("Useremail", emailId);
	    	return "indexlogged"; 
	    } 
	
	    @RequestMapping(value = "/logindone.html" , method = RequestMethod.POST)  
	    public String logindone(@ModelAttribute(SIGNIN) Signin login, 
	    		HttpSession session, Model model) {
	    	String  email= login.getEmail();
	    String pass= login.getPassword();
	   
	//    System.out.println(email + "  "+ pass);
	   try {
		
	 Session session2= sessionFactory.openSession();
	    transaction = session2.beginTransaction();
	    login = (Signin) session2.createQuery("FROM Signin U WHERE U.email = :email" ).setParameter("email", email)
                .uniqueResult();

            if (login != null && login.getPassword().equals(pass)) {
            	emailId= login.getEmail();
            	
            	model.addAttribute("Useremail", emailId);
                return "indexlogged";
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
            	transaction.rollback();
            }
            e.printStackTrace();
        }
        return "login";
    }
    
	    @RequestMapping(value = "/logout.html" , method = RequestMethod.GET)  
	    public String logout(HttpSession session) {
	    	session.invalidate();
	    	emailId=null;
			return "index";
	    }
	    
	    
	    
	    @RequestMapping(value = "/password.html" , method = RequestMethod.GET)  
	    public String password(Model model){ 
	    	model.addAttribute("Useremail", emailId);
	    	return "password"; 
	    }
	    
	    
	    @RequestMapping(value = "/changepassword.html" , method = RequestMethod.POST)  
	    public String changePassword(@ModelAttribute(SIGNIN) Signin updatepassword, 
	    		HttpSession session, Model model) {
	    	
		    String pass= updatepassword.getPassword();
		    System.out.println(pass);
	    	commandsService.updatepassword(pass);
					return "login";
	    }
	    }
	    
	 

