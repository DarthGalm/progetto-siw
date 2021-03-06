<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo fornitore registrato</title>
</head>
<body>
<f:view>
<h:form>
 <div style='float: right;'><h:commandButton value="Logout"  action="home"/></div>
 <li><h:commandButton value="Torna alla Home"  action="loggedAdminHome"/></li>

<h1>Registrazione effettuata con successo</h1>


<div>Nome: ${providerController.provider.firstName}</div>
<div>Cognome: ${providerController.provider.lastName}</div>
<div>Email: ${providerController.provider.email}</div>
<div>Numero di telefono: ${providerController.provider.phoneNumber}</div>
<div>Partita IVA: ${providerController.provider.vat}</div>
<br />
<div>Indirizzo: ${providerController.provider.address.street}</div>
<div>Città: ${providerController.provider.address.city}</div>
<div>Provincia: ${providerController.provider.address.state}</div>
<div>CAP: ${providerController.provider.address.zipcode}</div>
<div>Paese: ${providerController.provider.address.country}</div>

<br />




</h:form>
</f:view>
</body>
</html>