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
<h1>User list</h1> <hr>
	<c:forEach items="${usersList}" var="user">
		<a href="${pageContext.request.contextPath}/user/${user}">${user}</a>	<br> <hr>
	</c:forEach>
</body>
</html>