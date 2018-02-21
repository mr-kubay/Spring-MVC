<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Student List</h1>	
<c:forEach items= "${studentList}" var = "student">
Name : ${student.name} <br> 
Country : ${student.country} <br>
<c:forEach items = "${student.os}" var = "os">
--${os} <br>
</c:forEach>

<hr>
</c:forEach>