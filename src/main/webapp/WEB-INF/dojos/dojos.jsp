<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <title>Dojos and Ninjas</title>
</head>
<body style="margin: 5vw">
    <h1>Dojos</h1>
	<ul>
	    <c:forEach var="dojo" items="${dojos}">
			<li><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"></c:out></a></li>
	    </c:forEach>
	</ul>
	<a href="ninjas">Go see Ninjas</a>
</body>
</html>