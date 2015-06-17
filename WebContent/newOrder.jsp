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
		<th>Nome</th><th>Prezzo</th><th>Codice</th><th>Quantità disponibile</th>
	</tr>
	
		<c:forEach var="product" items="#{productController.inventoryCustomer}">
		<tr>
		<td>${product.name}</td>
		<td>${product.price} €</td>
		<td>${product.code}</td>
		<td>${product.stockQuantity}</td>
		</tr>
			
	</c:forEach>
</table>

<h3><h:outputText value="#{customerController.customer.firstname}"/>, inserisci i dati richiesti</h3>
<h3><h:outputText value="#{customerController.customer.email}"/>, questa è la tua email</h3>

<div>Codice del prodotto: <h:inputText value="#{orderController.productCode}" 
                     required="true"
                     requiredMessage="Il codice del prodotto è un campo obbligatorio"
                     id="productCode"/> <h:message for="productCode" />
	</div>

<div>Quantità: <h:inputText value="#{orderController.quantity}" 
                     required="true"
                     requiredMessage="La quantità del prodotto è un campo obbligatorio"
                     id="quantity"/> <h:message for="quantity" />
	</div>
	
	<div>
			<h:commandButton action="#{orderController.createOrder}">
				<f:setPropertyActionListener value="#{customerController.customer.email}" target="#{orderController.customerEmail}"/>
			</h:commandButton>
	</div>
</h:form>
</f:view>
</body>
</html>