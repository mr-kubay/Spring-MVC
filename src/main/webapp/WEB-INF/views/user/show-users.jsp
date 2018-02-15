<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach items="${userList}" var="user">
<a href = "${pageContext.request.contextPath}/user/${user}">${user.id} | ${user.firstName} | ${user.lastName} </a><br>
</c:forEach>