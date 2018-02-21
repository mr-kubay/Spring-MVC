<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<h1>Find course by Id</h1>

<form:form 
	method = "POST"
	action = "${pageContext.request.contextPath}/course/find" 
	modelAttribute="course">
	
	<form:input path="title"/>
	<input type = "submit" value ="find">
</form:form>

<c:forEach items = "${courses}" var ="co"> ${co.id} | ${co.title} | ${co.price} </c:forEach>
