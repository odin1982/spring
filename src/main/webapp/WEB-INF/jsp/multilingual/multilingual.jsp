<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1><spring:message code="home.title" /></h1>
	<p>
		<spring:message code="home.intro" />
	</p>
	<p>
		<a href="?lang=en">English</a> |
		<a href="?lang=fr">French</a>
	</p>
</body>
</html>