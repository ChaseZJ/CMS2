<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
    uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	img{
		
	}
</style>

</head>
	<body>
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" style="width: 1078px;">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner" role="listbox">
  	
    <div class="item active">
      <img src="${pageContext.request.contextPath }/img/01 (2).png" alt="..." style="width:1078px;height:300px">
      <div class="carousel-caption">
      </div>
    </div>
    <c:forEach var="slideShow" items="${slideShowList }" >
    <div class="item">
      <img src="${slideShow.slideShowSrc }" alt="..." style="width:1078px;height:300px">
      <div class="carousel-caption">
      </div>
    </div>
     </c:forEach>
    
  </div>
  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
	</div>
	</body>
</html>