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
    <h1>New Dojo</h1>
    <form:form action="/ninjas/new" method="post" modelAttribute="ninja">
	    <div class="form-group">
		    <form:label path="dojo">Dojo: </form:label><br />
            <form:errors path="dojo" class="text-danger"/>
            <form:select path="dojo">
            <c:forEach var="dojo" items="${dojos}">
            			<form:option value="${dojo}" label="${dojo.name}"/>
            </c:forEach>
            </form:select>
	    </div>
	    <div class="form-group">
            <form:label path="firstName">First Name: </form:label><br />
            <form:errors path="firstName" class="text-danger"/>
            <form:input style="width:250px;" path="firstName"/>
        </div>
        <div class="form-group">
            <form:label path="lastName">Last Name: </form:label><br />
            <form:errors path="lastName" class="text-danger"/>
            <form:input style="width:250px;" path="lastName"/>
        </div>
        <div class="form-group">
            <form:label path="age">Age: </form:label><br />
            <form:errors path="age" class="text-danger"/>
            <form:input style="width:250px;" path="age"/>
        </div>
	    <br />
	    <div>
		    <input type="submit" value="Create"/>
	    </div>
    </form:form>
</body>
</html>