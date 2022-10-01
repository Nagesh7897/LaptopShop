<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@page import="com.edubridge.beans.Help"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>footer</title>

<script type="text/javascript">
function validatehelp() {
	     
         var emailID = document.myForm.email.value;
         var atpos = emailID.indexOf("@");
         var dotpos = emailID.lastIndexOf(".");
         
        var number = document.myForm.number.value;
         if(number.length != 10) {
        	    window.alert("Phone number must be 10 digits.");
        	    return false;
        	}
         
         if (atpos < 1 || ( dotpos - atpos < 2 )) {
            alert("Please enter correct email ID")
            document.myForm.email.focus() ;
            return false;
         }
  
         if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myForm.email.value)))
         {
        	 alert("You have entered an invalid email address!")
              return (false);   
          }          
         alert("Your comment is sent!")
            return (true);
 
      }
</script>



</head>
<body>
     

<!------About Section-------> 
  <section id="about">
  <div class="container">
    <div class="row">
      
      <h2>About Us</h2>
      <div class="col-md-6">
        <div class="about-content">
        Welcome to Laptop Shop, your number one source for all things. We're dedicated to giving you the very best of services, with a focus on dependability, customer service and uniqueness.
Founded in 2022 by <b>Nagesh Naik.</b>
We are a diverse team with unique perspectives. United in our purpose, our strategy and our culture. Driven by our ambition and the power of technology to drive human progress. Unwavering in our commitment to equality, trust and advocacy for one another.

We hope you enjoy our products as much as we enjoy offering them to you. If you have any questions or comments, please don't hesitate to <b><a href="#contact">contact us</a></b>.
        </div> 
      </div>

      <div class="col-md-6 skills-bar">
      <p>Delivery Rate</p>
      <div class="progress">
      <div class="progress-bar" style="width:85%;">85%</div>
      </div>
      <br>
      <p>Customer Growth</p>
      <div class="progress">
      <div class="progress-bar" style="width:75%;">75%</div>
      </div>
      <br>
      <p>Happy Employee</p>
      <div class="progress">
      <div class="progress-bar" style="width:90%;">90%</div>
      </div>
      
      </div>
    </div>
    
  </div>  

    <br>

  </section>
<!------Services Section------->    
  <section id="services">
  
    <div class="container">
      <h1>Our Services</h1>
      <div class="row services" >
        <div class= "col-md-4 text-center">
          <div class="icon">
          <i class="fa fa-phone"></i>
          </div>
          <h3> 24/7 Support</h3>
          <p>on order related queries</p>
        </div>
      
        <div class="col-md-4 text-center">
          <div class="icon">
          <i class="fa fa-shopping-cart"></i>
          </div>
          <h3> Replacement within 7 days</h3>
          <p> if it is damage product</p>
        </div>
      
        <div class="col-md-4 text-center">
          <div class="icon">
          <i class="fa fa-truck"></i>
          </div>
          <h3>Get free delivery</h3>
          <p>on orders above Rs. 800</p>
        </div>
      </div>
    </div>
  
  </section>
  
<!------Contact------------>  
<section id="contact">  
  
  <div class="container">
    <h1>Get In Touch</h1>
    <div class="row">
      <div class="col-md-6">
        <form:form name= "myForm" class="contact-form" action="help.html" onsubmit="return validatehelp()" method="post" commandname="Help" modelAttribute="help">

         <div class="form-group ">
        <input name="name" type="textera" class="form-control" placeholder="Your Name" required>
        </div>
        <div class="form-group my-2">
        <input name="number" type="number" class="form-control" placeholder="Phone no." required>
        </div>
        <div class="form-group my-2">
        <input name="email" type="email" class="form-control" placeholder="Email" required> 
        </div>
        <div class="form-group my-2">
        <textarea  name="comment" class="form-control" rows="4" placeholder="Message..." required></textarea>
        </div>
     
        <button type="submit" class="btn btn-primary" value="help">Submit</button>
        </form:form>
      </div>
   
      <div class="col-md-6 ">

        <div class="follow "><b>Address  :</b> Laptop Shop, Sadashiv Peth, Pune - 411030.</div>
        <div class="follow "><b>Phone No :</b> (+91) 8855050064</div>
        <div class="follow "><b>E-mail   :</b> laptopshop@gmail.com</div>
      </div>
    </div>
  </div>
</section>

<div class="footer p-2">
  <p> All &copy; rights are reserved to Nagesh Naik.</p>
</div>
</body>
</html>