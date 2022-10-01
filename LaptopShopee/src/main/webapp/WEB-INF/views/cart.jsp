<%@page import="javax.swing.Action"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

   <!--  <link href="/css/index.css"  rel="stylesheet"> -->


 <style><%@include file="/WEB-INF/css/index.css"%></style>
 
    <title>Laptop Shop || Cart</title>
    <script type="text/javascript" src="jquery.store.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  </head>
  <body>
<jsp:include page="/WEB-INF/views/navbarlogged.jsp"/>
<div>
<br>
<form:form  >
<div id="container">  

<table class="table">
  <thead class="thead-light">
    <tr>
      <th scope="col">ProductName</th>
      <th scope="col">Brand</th>
      <th scope="col">Product Colour</th>
      <th scope="col">Product Price</th>
       <th scope="col">Remove</th>
    </tr>
  </thead>
  <c:forEach items="${products}" var="prod">
  <tbody>
    <tr>
      <th scope="row">${prod.productName}</th>
      <td>${prod.productBrand}</td>
      <td>${prod.productColour}</td>
      <td>Rs. ${prod.productPrice} /-</td>
     
   <td> <a href="<c:url value="/delete.html?productId=${prod.productId}" />">Remove</a>  </td> 
    </tr>
  </tbody>
  </c:forEach>
   
   <tr>
  <th>Total</th> 
  <td> </td>
  <td> </td>
  <th >Rs. 316987.0 /-</th>
   <td> </td>
  </tr>

</table>
</div>
<a href="<c:url value="/customerdetails.html" />">
<button type="button">Place Order</button> </a>
</form:form> 
</div>

<jsp:include page="/WEB-INF/views/footer.jsp" />

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
   
  </body>
</html>
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 