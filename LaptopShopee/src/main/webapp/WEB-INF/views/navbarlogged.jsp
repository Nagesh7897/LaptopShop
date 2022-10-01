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
          <a class="nav-link active" aria-current="page" href="indexlogged.html">Home</a>
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
          <a class="nav-link" href="cart.html">My Cart</a>
        </li>
         <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Setting
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="password.html">Change Password</a>
        </div>
      </li>
      </ul>

     <form class="d-flex">
         <label class="loginuser"  > <%=request.getAttribute("Useremail") %></label>
        <a href="logout.html" class= "btnc mx-2"> <button type="button" class="btn btn-danger"> Logout </button></a>
      </form>           
    </div>
  </div>
</nav>

</body>
</html>