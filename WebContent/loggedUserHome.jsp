<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina iniziale utente</title>
</head>
<body bgcolor = "#FFE4E1"
       link = "#663399"    alink = "#800080"    vlink = "#B0E0E6">
<f:view>
<h:form>
<div style='float: right;'><h:commandButton value="Logout"  action="home"/></div>
 
<h2>
<font face = "Papyrus" color = "#FF69B4"> <h1 align = "center"><h:outputFormat value="Benvenuto, {0}.">
	<f:param value="#{customerController.customer.firstname}" />
</h:outputFormat></h1></font>
</h2>


<font face = "Papyrus"
		size = "+2"> <ul type = "square">
<li><h:commandLink action="#{productController.listProducts}" value="Visualizza Catalogo" /></li>
<li><h:commandLink action="#{productController.newOrder}" value="Effettua un nuovo ordine">
	<f:setPropertyActionListener value="#{customerController.customer}" target="#{productController.customer}"/>
	</h:commandLink></li>
<li><h:commandLink action="#{orderController.listOrdersCustomer}" value="Visualizza ordini">
	<f:setPropertyActionListener value="#{customerController.customer.id}" target="#{orderController.customerId}"/>
	</h:commandLink></li>
</ul></font>

</h:form>
</f:view>
</body>
</html>