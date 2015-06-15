<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Catalogo</title>
</head>
<body>
<f:view>
<h1>Catalogo prodotti</h1>
<h:form>
<table>
	<tr>
		<th>Nome</th><th>Prezzo</th>
	</tr>
	<c:forEach var="product" items="#{productController.inventoryCustomer}">
		<tr><td>
		<h:commandLink action="#{productController.findCustomerProduct}" value="#{product.name}">
			<f:param name="id" value="#{product.id}" />
		</h:commandLink>
		</td><td>${product.price}</td></tr>
	</c:forEach>
</table>
</h:form>

</f:view>
</body>
</html>