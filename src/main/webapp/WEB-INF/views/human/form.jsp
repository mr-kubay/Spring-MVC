<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Human</title>
</head>
<body>
<h1> Human</h1>

<form:form
		action = "${pageContext.request.contextPath}/human/form"
		method = "POST"
		modelAttribute="humanModel">
		
		Name : <form:input path="name"/><form:errors path = "name" /> <br>
		AGE : <form:input path="age"/><form:errors path = "age" /> <br>
		Email : <form:input path="email"/><form:errors path = "email" /> <br>
		About : <form:input path="aboutMe"/><form:errors path = "aboutMe" /> <br>
		
		

	<input type = "submit" value = "create h">
</form:form>
</body>
</html>