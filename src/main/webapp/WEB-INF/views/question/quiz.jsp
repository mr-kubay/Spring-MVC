<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Quiz</h1>

<form:form 
		action = "${pageContext.request.contextPath}/question/quiz"
		method = "POST"
		modelAttribute="questionairre">

	Full name : <form:input path="fullName"/> <hr>
	Age : <form:select path="age">
			<form:options items = "${ageList}"/>	
		  </form:select> <hr>
		  
	Country : <form:select path="country">
		  		<form:options items = "${countryList}"/>	
	  	  	  </form:select><hr>
	  	  	  
	Sex : <form:radiobuttons path="gender" items = "${gender}"/><hr>	
	
	e-mail : <form:input path="email"/> <br>
	Graduation : <form:radiobuttons path="degree" items = "${degree}"/> <hr>
	
	OS you use : <form:checkboxes items="${os}" path="os"/> <hr>
	
	Networks : <form:checkboxes items="${socNets}" path="socialNetworks"/> <hr>
	
	Favorite language : <form:radiobuttons path="favoriteLanguage" items = "${favs}"/> <br>
	
	Experience : <form:select path="experience">
					<form:options items = "${exps}"/>			
  				 </form:select> <hr>
	Degree : <form:select path="rank">
			 	<form:options items="${ranks}"/>
			 </form:select> <hr>
	Technologies <form:checkboxes items="${techs}" path="technologies"/> <hr>
	<input type = "submit" value = "show results">
</form:form>