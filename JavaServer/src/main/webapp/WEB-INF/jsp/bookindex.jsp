<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books</title>
</head>
<body>

<header>
[<a href="/books">Show books</a>]
[<a href="/addbook">Add a book</a>] 
</header>
	
	
<div class="container">
 		<h2>Books</h2>    
 		
 		<form action="/books">
              Search books: <input type="text" name="search"><br>
              <input type="submit" value="Sök">
        </form>
 		
 <br>	
 		 
  		<table class="table table-condensed">
    		<thead>
      			<th>Title</th>
        		<th>Author</th>
        		<th>Year published</th>
    		</thead>
    	<tbody>
      		
      		<c:forEach items="${books}" var="book">
      		    <tr>
        		<td>${books.getTitle()}</td> 
        		<td>${books.getAuthor()}</td>
        		<td>${books.geYear()}</td>
        		<td><a href="editbook/${books.getId()}">Edit</a></td> 
        		<td><a href="deletebook/${books.getId()}">Delete</a></td> 
        		</tr>
        	</c:forEach>
      		
    	</tbody>
  		</table>
</div>
	

</body>

</html>