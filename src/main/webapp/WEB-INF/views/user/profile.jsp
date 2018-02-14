<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>User name is ${name}</h3>
	<h3>User e-mail</h3>
	<a href = "${pageContext.request.contextPath}/user/${name}/profile/edit">Edit profile</a>
	
	<h3>Show ${name}'s buying history</h3>
	<a href = "${pageContext.request.contextPath}/items/${item1}">History</a>
</body>
</html>