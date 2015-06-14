<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Associa prodotto a fornitore</title>
</head>
<body>
<f:view>
<h:form>


<h2>Inserisci i dati richiesti</h2>
<br />

<div>Partita IVA fornitore: <h:inputText value="#{adminController.vat}"
			required="true"
			requiredMessage="Per favore inserisci la partita iva"
			id="vat" /> <h:message for="vat" />
</div>

<div>Codice prodotto: <h:inputText value="#{adminController.code}"
				required="true"
				requiredMessage="Per favore inserisci il codice prodotto"
				id="code" /> <h:message for="code" />
</div>

<h:commandButton value="Esegui" action="#{adminController.providerJoinProduct}"/>
</h:form>
</f:view>
</body>
</html>