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
<body bgcolor = "#FFE4E1"
       link = "#663399"    alink = "#800080"    vlink = "#B0E0E6">
<f:view>
<font face = "Papyrus" color = "#FF69B4"> <h1 align = "center"> Catalogo prodotti</h1></font>
<h:form>
<div align= "center" valign= "middle">
<table> 
	<tr>
		<th><font face = "Courier New" color = "#FF1493" size = "+2" >Nome</font></th><th><font face = "Courier New" color = "#FF1493" size = "+2">Prezzo</font></th>
	</tr>
	<c:forEach var="product" items="#{productController.inventory}">
		<tr><td>
		<font face = "Courier New" color = "#800080" size = "+1">
		<h:commandLink action="#{productController.findProduct}" value="#{product.name}">
			<f:param name="id" value="#{product.id}" />
		</h:commandLink> </font>
		</td> 
		
		<td> <font face = "Courier New" color = "#800080" size = "+1"> ${product.price}€</font></td></tr>
	</c:forEach>

</table> 
</div>
</h:form>

</f:view>
</body>
</html>