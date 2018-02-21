<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:forEach items = "${courseList}" var = "course">
	${course.id} | ${course.description} | ${course.title} | ${course.price} <br>
</c:forEach>
