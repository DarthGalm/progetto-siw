<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista Fornitori di un prodotto</title>
</head>
<body>
<f:view>
<h2>Fornitori disponibili per il prodotto: <h:outputText value="#{adminController.product.name}"/></h2>
<h:form>
<table>
	<tr>
		<th>Nome</th><th>Email</th><th>Telefono</th>
	</tr>
	<c:forEach var="provider" items="#{adminController.providers}">
		<tr>
		<td>${provider.name}</td>
		<td>${provider.email}</td>
		<td>${provider.phoneNumber}</td>
		</tr>
	</c:forEach>
</table>
<br />
<h:commandLink value="Torna alla Home" action="loggedAdminHome"/>
</h:form>
</f:view>


</body>
</html>