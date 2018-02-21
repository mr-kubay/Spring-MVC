<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Create new Course</h1>

<form:form
	method = "POST"
	action = "${pageContext.request.contextPath}/course/add"
	modelAttribute="course">
	
	Title <form:input path="title"/> 
	Description <form:input path="description"/>
	Price <form:input path="price"/>
	
	<input type = "submit" value = "Create new course">

</form:form>