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
<body>
<f:view>
<h:form>
<div style='float: right;'><h:commandButton value="Logout"  action="home"/></div>
 
<h2>
<h:outputFormat value="Benvenuto, {0}.">
	<f:param value="#{customerController.customer.firstname}" />
</h:outputFormat>
</h2>

<ul>
<li><h:commandLink action="#{productController.listCustomerProducts}" value="Visualizza Catalogo" /></li>
<li><h:commandLink action="newOrder" value="Acquista un prodotto" /></li>
		</ul>

</h:form>
</f:view>
</body>
</html>