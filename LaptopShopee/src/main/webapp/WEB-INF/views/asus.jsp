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

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<title>ASUS || Laptop Shop</title>
 <style><%@include file="/WEB-INF/css/shopitemslist.css"%></style>

</head>
<body>
<nav>
 
<ul class="navul">
  <li class="customlist"><a  href="indexlogged.html">Home</a></li>
    <li class="customlist"><a href="cart.html">Cart</a> </li>
       
</ul>
</nav>
<form:form>
<c:forEach items="${products}" var="prod">
<div id="container">    

    <div class="product-details"> 
      <!-- It is used for featch the data from Database one by one -->
    <h1 >${prod.productName}</h1>  

            <p class="information"> ${prod.productDesc}</p>
     
<div class="control" align="center">
    
    <a href="<c:url value="/productId.html?productId=${prod.productId}"/>"> 
    <button  type="button" class="btn">
     <span class="price">Rs. ${prod.productPrice} /-</span>
   <span class="shopping-cart"><i class="fa fa-shopping-cart" aria-hidden="true"></i></span>
   <span class="buy"> Get now</span>
 </button>
  </a>
</div>          
</div> 
<div class="product-image" >
    
    <img src="${pageContext.request.contextPath}/images/products/${prod.productImageId}.jpg" alt="HP Pavilion 15-eg2019TX-image">  

<div class="info">
    <h2> Description</h2>
    <ul>
        <li><strong>SCREEN SIZE : </strong>${prod.productScreenSize}  </li>
        <li><strong>COLOUR : </strong> ${prod.productColour}</li>
        <li><strong>Warranty:  </strong>${prod.productWarranty}</li>
        <li>${prod.productAccessories}</li>  
    </ul>
</div>
</div>
</div>
</c:forEach>
</form:form> 
</body>
</html>