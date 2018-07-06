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



<h3>Add a book</h3>

<form:form method="POST" action="/addbook" modelAttribute="books">
         <table>
            <tr>
                <td><form:label path="title">Title</form:label></td>
                <td><form:input path="title"/></td>
            </tr>
            <tr>
                <td><form:label path="author">Author</form:label></td>
                <td><form:input path="author"/></td>
            </tr>
            <tr>
                <td><form:label path="published">Year</form:label></td>
                <td><form:input path="published"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
  </form:form>
