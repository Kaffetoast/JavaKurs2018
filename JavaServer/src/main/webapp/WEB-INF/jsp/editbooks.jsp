<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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



<h3>Välkommen, Uppdatera bok</h3>

<form:form method="POST" action="/editsave" modelAttribute="Book"> 
         <table>
            <tr>
             <td><form:input id="id"  hidden="true" path="id"/></td>
             <tr>
            <tr>
                <td><form:label path="title">Boktitel</form:label></td>
                <td><form:input value="${book.getTitle()}" path="title"/></td>                           
            </tr>
            <tr>
                <td><form:label path="author">Författare</form:label></td>
                <td><form:input value="${book.getAuthor()}" path="author"/></td>
            </tr>
            <tr>
                <td><form:label path="published">Utgivningsår</form:label></td>
                <td><form:input value="${book.getPublished()}" path="published"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
  </form:form>>
  </form:form>