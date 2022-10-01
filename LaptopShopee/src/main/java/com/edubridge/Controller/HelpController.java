package com.edubridge.Controller;   
 
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edubridge.beans.Help;
import com.edubridge.beans.Signin;
import com.edubridge.service.HelpService;


@Controller  
public class HelpController {  
	
	  /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */
	@Autowired
	private HelpService helpService;
	
	private static final String HELP = "help";

	
	private static final String SIGNIN = "signin";
	
	@RequestMapping(value = "/help.html", method = RequestMethod.POST)
	public String help(@ModelAttribute(HELP) Help help, @ModelAttribute(SIGNIN) Signin login,
			HttpSession session, Model model) {
		model.addAttribute("Useremail", Commands.emailId);
		helpService.add(help);
		System.out.println(Commands.emailId);
		
//		
//		session.setAttribute(HELP, help);
//		sessionFactory.openSession().save(help);
//		//tenantService.add(tenant);
//		model.addAttribute(HELP, help);
//		sessionFactory.close();
		if(Commands.emailId == null) {
		return "index";
		}
		else {
			return "indexlogged";
		}
	}
}  