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
<body bgcolor = "#FFE4E1"
       link = "#663399"    alink = "#800080"    vlink = "#B0E0E6">
<font face = "Papyrus" color = "#FF69B4"> <h1 align = "center">Benvenuti nel portale F&G</h1> </font>
		<font face = "Papyrus"
		size = "+2"> <ul type = "square">
		
			<li><h:commandLink value="Registrati"  action="newCustomer"/></li>
			<li><h:commandLink value="Login"  action="login"/></li>
			<li><h:commandLink action="#{productController.listProducts}" value="Visualizza Catalogo" /></li>
		</ul> </font>
		
		<center><img src = "http://files.parsetfss.com/fc3d7dc3-23c0-4475-9462-24019d2efb58/tfss-501b35b6-b45f-457b-8bf5-62194bda784d-photo.jpg" width="300" height="350" /></center>
		
	<div style='float: right;'><font face = "Papyrus" color = "#4B0082" ><h:commandLink value="Login Amministratore"  action="adminLogin"/></font></div>
	
</body>
</h:form>
</f:view>
</html>

