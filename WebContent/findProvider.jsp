<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Trova fornitore</title>
</head>
<f:view>
<h:form>
<body>
<h2>Inserisci il codice del prodotto</h2>

<div>Codice prodotto: <h:inputText value="#{adminController.code}"
				required="true"
				requiredMessage="Per favore inserisci il codice prodotto"
				id="code" /> <h:message for="code" />
</div>


<h:commandButton value="Trova fornitori" action="#{adminController.findProvidersForProduct}"/>

</body>
</h:form>
</f:view>
</html>