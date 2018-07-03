<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">

<body>

	Message: ${message}
	<br>
	<table>
	<tr>
	<c:forEach items="${books}" var="books">
	<td>${books.getBook_id()}</td>
	<td>${books.getAuthor_id()}</td>
	<td>${books.getTitle()}</td>
	<td>${books.getYear()}</td>
	</c:forEach>
	</tr>
      
	</table>
</body>

</html>