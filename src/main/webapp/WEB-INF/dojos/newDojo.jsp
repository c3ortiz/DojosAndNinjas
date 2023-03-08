<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <h1>New Dojo</h1>
    <form:form action="/dojos/new" method="post" modelAttribute="dojo">
	    <div>
		    <form:label path="name">Name: </form:label><br />
            <form:errors path="name" class="text-danger"/>
            <form:input style="width:250px;" path="name"/>
	    </div>
	    <br />
	    <div>
		    <input type="submit" value="Submit"/>
	    </div>
    </form:form>
</body>
</html>