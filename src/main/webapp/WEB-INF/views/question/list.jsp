<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>List quiz</h1>
<c:forEach items = "${quizs}" var = "quiz">
Name ${quiz.fullName} <br>
Email ${quiz.email} <br>
Email ${quiz.favoriteLanguage} <br>
<c:forEach items = "${quiz.os}" var = "os">
 --${os} <br>
</c:forEach> <hr>
</c:forEach>