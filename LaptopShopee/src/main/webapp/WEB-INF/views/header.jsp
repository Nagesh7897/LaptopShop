<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>head</title>

<script type="text/javascript">
function massege(){
alert("To access the page. Please Login!")
}
</script>

</head>
<body>

<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    
    <div class="carousel-item active" >
      <img src="${pageContext.request.contextPath}/images/hp.jpg" class="d-block w-100" alt="HP Laptop Image" >
      <div class="carousel-caption d-none d-md-block" onclick="return massege()">
        <a href="index.html" style="text-decoration: none; color: inherit;" > 
          <h5>HP Laptops</h5>
        <p>They should make the world a better place.</p></a>
     </div> 
    </div>
    <div class="carousel-item">
      <img src="${pageContext.request.contextPath}/images/dell.jpg" class="d-block w-100" alt="Dell Laptop Image" >
      <div class="carousel-caption d-none d-md-block" onclick="return massege()">
         <a href="index.html" style="text-decoration: none; color: inherit;" > 
          <h5>DELL Laptops</h5>
        <p>Innovation that stops at nothing.</p> </a>
      </div>
    </div>
    <div class="carousel-item">
      <img src="${pageContext.request.contextPath}/images/asus.jpg" class="d-block w-100" alt="Asus Laptop Image" >
      <div class="carousel-caption d-none d-md-block" onclick="return massege()">
         <a href="index.html" style="text-decoration: none; color: inherit;" >
          <h5>ASUS Laptops</h5>
        <p>"Inspiring Innovation - Persistent Perfection"</p></a>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

</body>
</html>