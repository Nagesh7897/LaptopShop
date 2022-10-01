<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Content</title>

<script type="text/javascript">
function massege(){
alert("To access the page. Please Login!")
}
</script>

</head>
<body>
'
<div class="row my-4 ">
 <div class="container col-sm-3" onclick="return massege()">
<div class="card">
 <a href="index.html" style="text-decoration: none; color: inherit;" >  
 <img src= "${pageContext.request.contextPath}/images/hpcard.jpg" alt="HP" style="width:338px " >
<!-- <img src= "images/hpcard.jpg" alt="HP" style="width:338px " >                                             This will also featch the data--> 
  <div class="mx-4">
    <h4><b>HP</b></h4>
    <p>Laptops And Accessories</p>
  </div> </a>
</div>
</div>

<div class="container col-sm-3" onclick="return massege()">
<div class="card ">
 <a href="index.html" style="text-decoration: none; color: inherit;" >  
  <img src="${pageContext.request.contextPath}/images/dellcard.png" alt="DELL" style="width:338px " >
  <div class="mx-4">
    <h4><b>DELL</b></h4>
    <p>Laptops And Accessories</p>
  </div> </a>
</div>
</div>

<div class="container col-sm-3" onclick="return massege()">
<div class="card ">
 <a href="index.html" style="text-decoration: none; color: inherit;" >  
  <img src="${pageContext.request.contextPath}/images/asuscard.jpg" alt="ASUS" style="width:338px ">
  <div class="mx-4">
    <h4><b>ASUS</b></h4>
    <p>Laptops And Accessories</p>
  </div> </a>
</div>
</div>

</body>
</html>