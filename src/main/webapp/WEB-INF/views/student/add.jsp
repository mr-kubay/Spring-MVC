<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h1>Student add page</h1>
<form:form 
		action = "${pageContext.request.contextPath}/student/add"
		method = "POST"
		modelAttribute="studentModel">
	Name : <form:input path="name"/> <hr>
	
	Student country : 
	 <form:select path="country">
	 	 <form:options items = "${countryOptions}"/>
	 	 
	<%--<form:option value="India">India</form:option>
	<form:option value="USA">United States</form:option>
	<form:option value="UA">Ukraine</form:option>
	<form:option value="FR">France</form:option>--%>
	
	</form:select> <hr> 
	
	Student favourite language: 
	
	<form:radiobuttons path="favoriteLanguage" items = "${favLangs}" /> <hr> 
	<%-- <form:radiobutton path="favoriteLanguage" value = "Java" label = "Java"/>
	<form:radiobutton path="favoriteLanguage" value = "C#" label = "C sharp"/>
	<form:radiobutton path="favoriteLanguage" value = "PHP" label = "PHP"/> <hr> --%>
	
	
	Student operation systems : 
	<form:checkbox path="os" value = "MS Windows" label = "MS Windows"/>
	<form:checkbox path="os" value = "Linux" label = "Linux"/>
	<form:checkbox path="os" value = "Mac OS" label = "Mac OS"/> <hr>
	
	<%-- можна зробити через <form:checkboxes> так само як і <form:radiobuttons> --%>
	
	
	<form:select path="studentDegree">
		<form:options items = "${studentDegrees}"/> 
	</form:select><hr>
	
	
	<input type = "submit" value = "Save student"> 
	
</form:form>