
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>Items list</h1>
<hr>
	<c:forEach items="${itemsList}" var="item">
	Name : ${item}
		<a href="${pageContext.request.contextPath}/items/${item.id}/edit">Edit</a> <br> <hr>
		<a href="${pageContext.request.contextPath}/items/${item.id}/delete">Delete</a> <br> <hr>
	</c:forEach> 
