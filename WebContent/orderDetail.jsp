<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ordini</title>
</head>
<body>
<f:view>
<h:form>
<body>
<h1>Lista oggetti ordinati</h1>
<table>
	<tr>
		<th>Oggetto</th><th>Quantità</th><th>Prezzo Totale</th>
	</tr>
	<c:forEach var="orderLine" items="#{orderController.orderLines}">
		<tr>
		<td>${orderLine.productName}</td>
		<td>${orderLine.quantity}</td>
		<td>${orderLine.totalPrice}</td>
		</tr>
		</c:forEach>
</table>
</body>
</h:form>
</f:view>
</body>
</html>