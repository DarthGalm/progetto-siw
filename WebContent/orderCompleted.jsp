<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo Ordine effettuato</title>
</head>
<body>
<f:view>
<h:form>
<h1>Ordine effettuato con successo</h1>


<div>Data: ${orderController.order.creationTime}</div>

<br />

<div>Prodotto ordinato: ${orderController.product.name}</div>
<div>Quantità: ${orderController.orderLine.quantity}</div>

 <li><h:commandButton value="Concludi il tuo ordine"  action="#{orderController.closeOrder}"/></li>
 <li><h:commandButton value="Compra un altro oggetto" action="#{productController.newOrder}"/></li>



</h:form>
</f:view>
</body>
</html>