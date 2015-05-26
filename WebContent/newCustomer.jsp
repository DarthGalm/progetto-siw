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
                     requiredMessage="Il nome è un campo obbligatorio"
                     id="firstname"/> <h:message for="firstname" />
	</div>
	<div>Cognome: <h:inputText value="#{customerController.lastname}" 
                     required="true"
                     requiredMessage="Il cognome è un campo obbligatorio"
                     id="lastname"/> <h:message for="lastname" />
	</div>	
    <div>Indirizzo: <h:inputText value="#{customerController.address}" 
                     required="true"
                     requiredMessage="L'indirizzo è un campo obbligatorio"
                     id="address"/> <h:message for="address" />
	</div>
	<div>Data di Nascita: <h:inputText value="#{customerController.dateOfBirth}" 
                     required="true"
                     requiredMessage="La data di nascita è un campo obbligatorio"
                     id="dateOfBirth"/> <h:message for="dateOfBirth" />
	</div>
	<div>Email: <h:inputText value="#{customerController.email}" 
                     required="true"
                     requiredMessage="L'email è un campo obbligatorio"
                     id="email"/> <h:message for="email" />
	</div>
    <div>Password: <h:inputTextarea value="#{customerController.password}" 
    				required="true"
                     requiredMessage="La password è un campo obbligatorio"
                     id="password"/> <h:message for="password" />
    				cols="20" 
    				rows="5"/> 
    </div>
	<div>
		<h:commandButton value="Registrati"  action="#{customerController.createCustomer}"/>
	</div>
</h:form>
</f:view>
</body>
</html>