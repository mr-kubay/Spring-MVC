<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${item1}</h1>
	<a href = "${pageContext.request.contextPath}/items/${item1}/shopcard">Add this item to shopcard</a> <br>
	<a href = "${pageContext.request.contextPath}/admin/items/${item1}/edit">Edit item </a>
	
</body>
</html>