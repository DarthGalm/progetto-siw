<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>INSERISCI I TUOI DATI</title>
</head>
<body>
<f:view>
<h:form>
    <div>Nome: <h:inputText value="#{customerController.firstname}" 
                     required="true"
                     requiredMessage="Il nome e' un campo obbligatorio"
                     id="firstname"/> <h:message for="firstname" />
	</div>
	<div>Cognome: <h:inputText value="#{customerController.lastname}" 
                     required="true"
                     requiredMessage="Il cognome e' un campo obbligatorio"
                     id="lastname"/> <h:message for="lastname" />
	</div>
	
	<div>Data di Nascita: <h:inputText value="#{customerController.dateOfBirth}" 
                     required="true"
                     requiredMessage="La data di nascita e' un campo obbligatorio"
                     id="dateOfBirth"/> <h:message for="dateOfBirth" />
	</div>
	<div>Email: <h:inputText value="#{customerController.email}" 
                     required="true"
                     requiredMessage="L'email e' un campo obbligatorio"
                     id="email"/> <h:message for="email" />
	</div>
    <div>Password: <h:inputText value="#{customerController.password}" 
    				required="true"
                     requiredMessage="La password e' un campo obbligatorio"
                     id="password"/> <h:message for="password" />
    </div>
	<div>
		<h:commandButton value="Registrati"  action="#{customerController.createCustomer}"/>
	</div>
</h:form>
</f:view>
</body>
</html>