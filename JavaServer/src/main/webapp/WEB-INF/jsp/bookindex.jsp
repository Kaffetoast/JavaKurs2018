<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<header>
[<a href="/books">Visa boklista</a>]
[<a href="/addbook">L�gg till ny bok</a>] 
</header>
	
	
<div class="container">
 		<h2>B�cker</h2>    
 		
 		<form action="/books">
              S�k b�cker: <input type="text" name="search"><br>
              <input type="submit" value="S�k">
        </form>
 		
 <br>	
 		 
  		<table class="table table-condensed">
    		<thead>
      			<th>Titel</th>
        		<th>F�rfattare</th>
        		<th>Utgivnings�r</th>
    		</thead>
    	<tbody>
      		
      		<c:forEach items="${books}" var="book">
      		    <tr>
        		<td>${book.getTitle()}</td> 
        		<td>${book.getAuthor()}</td>
        		<td>${book.getPublished()}</td>
        		<td><a href="editbook/${book.getId()}">�ndra</a></td> 
        		<td><a href="deletebook/${book.getId()}">Ta bort</a></td> 
        		</tr>
        	</c:forEach>
      		
    	</tbody>
  		</table>
</div>
	

</body>

</html>