<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login amministratore</title>
</head>
<body>
<f:view>
<h:form>

<h2>Inserisci i dati per il login</h2>
<br />

<div>Email: <h:inputText value="#{adminController.email}"
			required="true"
			requiredMessage="Per favore inserisci la tua e-mail"
			id="email" /> <h:message for="email" />
</div>

<div>Password: <h:inputSecret value="#{adminController.password}"
				required="true"
				requiredMessage="Per favore inserisci la password"
				id="password" /> <h:message for="password" />
</div>

<br />

<div>
		<h:commandButton value="Accedi"  action="#{adminController.login}"/>
</div>

</h:form>
</f:view>
</body>
</html>