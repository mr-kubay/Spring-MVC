<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>
	<tiles:getAsString name = "title"/>
</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel = "stylesheet" type = "text/css" href="${pageContext.request.contextPath}/resources/style.css"> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
</head>
<body>
	 <tiles:insertAttribute name = "header"/>
	 	<div class="container text-center">    
  			<div class="row content">
  				<tiles:insertAttribute name = "sidebar"/>
  					<div class="col-sm-10 text-center"> 
  						<tiles:insertAttribute name = "body"/>
  					</div>
  			</div>
  		</div>
	 <tiles:insertAttribute name = "footer"/>
</body>
</html>