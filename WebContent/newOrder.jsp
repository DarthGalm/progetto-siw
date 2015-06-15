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
		<th>Nome</th><th>Prezzo</th><th>Codice</th> 
	</tr>
	
		<c:forEach var="product" items="#{productController.inventory}">
		<tr><td>
		<h:commandLink action="#{productController.findProduct}" value="#{product.name}">
			<f:param name="id" value="#{product.id}" />
		</h:commandLink></td>
		<td>${product.price}</td>
		<td>${product.code}</td>
		</tr>
			
	</c:forEach>
</table>

<h3>Inserisci il codice del prodotto che vorresti acquistare</h3>

<div>Nome: <h:inputText value="#{OrderController.code}" 
                     required="true"
                     requiredMessage="Il codice del prodotto è un campo obbligatorio"
                     id="code"/> <h:message for="code" />
	</div>
	
	<div>
		<h:commandButton value="Effettua Ordine"  action="#{orderController.createOrder}"/>
	</div>
</h:form>

</f:view>
</body>
</html>