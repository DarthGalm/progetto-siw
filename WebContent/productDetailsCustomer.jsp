<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dettaglio prodotto</title>
</head>
<body>
<f:view>
<h:form>
<h1>Dettagli prodotto</h1>


<div>Nome: ${productController.product.name}</div>
<div>Codice: ${productController.product.code}</div>
<div>Prezzo: ${productController.product.price} €</div>
<div>Quantità in magazzino: ${productController.product.stockQuantity}</div>
<div>Descrizione: ${productController.product.description}</div>
<br />

<h:commandLink value="Torna alla Home" action="loggedUserHome" />



</h:form>
</f:view>
</body>
</html>