<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>
<h1>There are many users</h1>
<c:if test="${nbUsers != null}">
	<p>There are ${nbUsers} users</p>
</c:if>
<c:if test="${id != null}">
	<p>Id: ${id}</p>
</c:if>
<c:if test="${field != null}">
	<p>Field: ${field}</p>
</c:if>
</body>
</html>