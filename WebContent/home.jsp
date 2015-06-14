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
<f:view>
<h:form>
<body>
<h1>Benvenuti nel portale F&G</h1> 
		<ul>
			<li><h:commandLink value="Registrati"  action="newCustomer"/></li>
			<li><h:commandLink value="Login"  action="login"/></li>
			<li><h:commandLink action="#{productController.listProducts}" value="Visualizza Catalogo" /></li>
		</ul>
	<div style='float: right;'><h:commandLink value="Login Amministratore"  action="adminLogin"/></div>
</body>
</h:form>
</f:view>
</html>

