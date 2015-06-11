<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Panello amministrazione</title>
</head>
<body>
<f:view>

<h2>
<h:outputFormat value="Benvenuto, {0}. Qui sono presenti le opzioni di amministrazione">
	<f:param value="#{adminController.admin.name}" />
 </h:outputFormat>
</h2>

<ul>
			<li><a href='<c:url value="/faces/newProduct.jsp" />'>Inserisci nuovo prodotto</a></li>
			<li><a href='<c:url value="/faces/newProvider.jsp" />'>Inserisci un fornitore</a></li>
			<li><h:form>
			<h:commandLink action="#{productController.listProducts}"
						value="Visualizza Catalogo" />
						</h:form></li>
</ul>

</f:view>
<body>
</html>