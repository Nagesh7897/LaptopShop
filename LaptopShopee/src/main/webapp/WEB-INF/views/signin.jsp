<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

<title>Sign Up || Laptop Shop</title>

<style><%@include file="/WEB-INF/css/index.css"%></style>


<script type="text/javascript" >
function validate(){

    var password = document.myform.password.value; 
    var cpassword = document.myform.confirmPassword.value; 
    
    var emailID = document.myform.email.value;
    var atpos = emailID.indexOf("@");
    var dotpos = emailID.lastIndexOf(".");
    
   
    //console.log ("hi");

    if (password.length < 8)
    {
      alert("Password should be more than 8 charactors");
      return false;
     
    }
     if (cpassword != password )
    {
      alert("Password & Confirm Password not MATCH");
      return false; 
    }
 
     
     if (atpos < 1 || ( dotpos - atpos < 2 )) {
        alert("Please enter correct email ID")
        document.myform.email.focus() ;
        return false;
     }

     if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myform.email.value))
     {
          return (true);
        
      }
     else{
        alert("You have entered an invalid email address!");
        return (false);
     }
     alert("Signin Sucessfully. Please Login the page!");
    
    return true;
  }
</script>
</head>
<body>
<jsp:include page="/WEB-INF/views/navbar.jsp" />


<div class="row my-4 ">
<div class="col-sm-8" >
<img src="<%=request.getContextPath() + "/images/signin.jpg"%>"  class="bg-image" style= "height:640px; width:900px" >
</div>


<div class="  col-sm-4">
<form:form name="myform" action="signup.html" onsubmit="return validate()" method="post" style="border:1px solid #ccc">
  
  <div class="container p-4">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <label for="cpsw"><b>Confirm Password</b></label>
    <input type="password" placeholder="Confirm Password" name="confirmPassword" required>

    <div class="clearfix"> 
  
      <button type="submit" class="signupbtn">Sign Up</button>
          <button type="button" class="cancelbtn">Cancel</button>
    </div>
</div>
</form:form>
</div>
</div>

 <jsp:include page="/WEB-INF/views/footer.jsp" />
</body>
</html>