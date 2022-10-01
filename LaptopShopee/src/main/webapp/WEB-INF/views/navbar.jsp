<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>

 
<meta charset="ISO-8859-1">
<title>Navbar</title>



</head>
<body>

   <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid ">
    <a class="navbar-brand" href="#">Laptop Shop</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#contact">Contact</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="#about">About Us</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="#services">Our Services</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="#contact">Help</a>
        </li>
         <li class="nav-item">
          <a class="nav-link disabled" href="">My Cart</a>
        </li>
      </ul>

     <form class="d-flex">
        <a   href="signin.html" class= " btnc mx-2"> <button type="button" class="btn btn-danger">  Sign-Up </button></a> 
        <a href="login.html" class= "btnc mx-2"> <button type="button" class="btn btn-primary"> Login </button></a>
      </form>           
    </div>
  </div>
</nav>

</body>
</html>