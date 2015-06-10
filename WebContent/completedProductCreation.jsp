<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo prodotto registrato</title>
</head>
<body>
<f:view>
<h1>Registrazione effettuata con successo</h1>


<div>Nome: ${customerController.product.name}</div>
<div>Codice: ${customerController.customer.code}</div>
<div>Prezzo: ${customerController.customer.price} €</div>
<div>Descrizione: ${customerController.customer.description}</div>
<div>Quantità in magazzino: ${customerController.customer.stockQuantity}</div>
<br />
<a href='<c:url value="/faces/loggedAdminHome.jsp" />'>Torna alla HOME</a>




</f:view>
</body>
</html>