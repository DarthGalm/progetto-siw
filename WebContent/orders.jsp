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
<h1>Lista ordini</h1>
<h2>Clicca su un ordine per chiuderlo</h2>
<table>
	<tr>
		<th>Id</th><th>Data</th><th>Cliente</th>
	</tr>
	<c:forEach var="order" items="#{orderController.orders}">
		<tr><td>
		<h:commandLink action="#{orderController.closeOrderAdmin}" value="#{order.id}">
			<f:setPropertyActionListener target="#{orderController.id}" value="#{order.id}" />
		</h:commandLink></td>
		<td>${order.creationTime}</td>
		<td>${order.customer}</td>
		</tr>
		</c:forEach>
</table>
</body>
</h:form>
</f:view>
</body>
</html>