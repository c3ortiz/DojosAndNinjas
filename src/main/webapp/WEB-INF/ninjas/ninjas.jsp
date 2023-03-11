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
<body>
    <h1 class=text-center>Ninjas</h1>
    <table class="table">
      <thead>
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Age</th>
          <th>Dojo</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="ninja" items="${ninjas}">
            <tr>
                <td><c:out value="${ninja.firstName}"></c:out></td>
                <td><c:out value="${ninja.lastName}"></c:out></td>
                <td><c:out value="${ninja.age}"></c:out></td>
                <td><c:out value="${ninja.dojo.name}"></c:out></td>
            </tr>
        </c:forEach>
      </tbody>
    </table>
    <a href="dojos">Go see Dojos</a>
</body>
</html>