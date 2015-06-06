<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<f:view>
		<h1>Benvenuti nel portale F&G</h1>
		<ul>
			<li><a href='<c:url value="/faces/newCustomer.jsp" />'>Registrati</a></li>
			<li><a href='<c:url value="/faces/logIn.jsp" />'>Login</a></li>
		</ul>
	</f:view>
</body>
</html>

