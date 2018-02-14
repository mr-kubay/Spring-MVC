<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Items list</h1>
<hr>
	<c:forEach items="${itemsList}" var="item">
		<a href="${pageContext.request.contextPath}/items/${item}">${item}</a> <br> <hr>
	</c:forEach> 
</body>
</html>