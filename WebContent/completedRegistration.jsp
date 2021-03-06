<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo Cliente registrato</title>
</head>
<body bgcolor = "#FFE4E1"
       link = "#663399"    alink = "#800080"    vlink = "#B0E0E6">
<f:view>
<h:form>
<font face = "Papyrus" color = "#FF69B4"> <h1 align = "center"> Registrazione effettuata con successo</h1></font>

<font color = "#4B0082">
<div>Nome: ${customerController.customer.firstname}</div>
<div>Cognome: ${customerController.customer.lastname}</div>
<div>Data di nascita: ${customerController.customer.dateOfBirth}</div>
<div>Indirizzo eMail: ${customerController.customer.email}</div>
<br />
<div>Indirizzo: ${customerController.customer.address.street}</div>
<div>Città: ${customerController.customer.address.city}</div>
<div>Provincia: ${customerController.customer.address.state}</div>
<div>CAP: ${customerController.customer.address.zipcode}</div>
<div>Paese: ${customerController.customer.address.country}</div>
</font>

<br />

 <li><h:commandButton value="Torna alla Home"  action="home"/></li>



</h:form>
</f:view>
</body>
</html>