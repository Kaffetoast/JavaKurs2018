<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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


<h3>Update books</h3>

<form:form method="POST" action="/savebook" modelAttribute="books"> 
         <table>
            <tr>
             <td><form:input id="id"  hidden="true" path="id"/></td>
             <tr>
            <tr>
                <td><form:label path="title">Titles</form:label></td>
                <td><form:input value="${books.getTitle()}" path="title"/></td>                           
            </tr>
            <tr>
                <td><form:label path="author">Author</form:label></td>
                <td><form:input value="${books.getAuthor()}" path="author"/></td>
            </tr>
            <tr>
                <td><form:label path="year">Year</form:label></td>
                <td><form:input value="${books.getYear()}" path="year"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
  </form:form>
