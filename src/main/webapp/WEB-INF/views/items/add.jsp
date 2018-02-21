<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Add item</h1>
<form:form
	method = "POST"
	action = "${pageContext.request.contextPath}/items/add"
	modelAttribute = "item"> 
	
Item name : <form:input path="name"/> <br>
Item description : <form:input path="descr"/> <br>
Item amount : <form:input path="amount"/> <br>
Item price : <form:input path="price"/> <br>		

<input type = "submit" value = "create item" >
</form:form>