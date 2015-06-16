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
<f:view>
<h:form>
<body>
<h2>Fornitori disponibili per il prodotto: <h:outputText value="#{adminController.product.name}"/></h2>

<table>
	<tr>
		<th>Nome</th><th>Email</th><th>Telefono</th>
	</tr>
	<c:forEach var="provider" items="#{adminController.providers}">
		<tr>
		<td><h:outputText value="#{provider.name}"/></td>
		<td><h:outputText value="#{provider.email}"/></td>
		</tr>
	</c:forEach>
</table>
<br />

<h:commandLink value="Torna alla Home" action="loggedAdminHome"/>

</body>
</h:form>
</f:view>
</html>