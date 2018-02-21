<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Edit item</h1>
<form:form
	method = "POST"
	action = "${pageContext.request.contextPath}/items/${item.id}/edit"
	modelAttribute = "item"> 
	
<form:hidden path="id"/>	
Item name : <form:input path="name"/> <br>
Item description : <form:input path="descr"/> <br>
Item amount : <form:input path="amount"/> <br>
Item price : <form:input path="price"/> <br>		

<input type = "submit" value = "edit item" >
</form:form>