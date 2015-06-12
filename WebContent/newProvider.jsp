<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrazione</title>
</head>
<body>
<f:view>
<h:form>
	<h1>Inserisci i dati del fornitore</h1>
	<br />
	
    <div>Nome: <h:inputText value="#{providerController.firstName}" 
                     required="true"
                     requiredMessage="Il nome è un campo obbligatorio"
                     id="firstName"/> <h:message for="firstName" />
	</div>
	 <div>Cognome: <h:inputText value="#{providerController.lastName}" 
                     required="true"
                     requiredMessage="Il cognome è un campo obbligatorio"
                     id="lastName"/> <h:message for="lastName" />
	</div>
	<div>Email: <h:inputText value="#{providerController.email}" 
                     required="true"
                     requiredMessage="L'email è un campo obbligatorio"
                     id="email"/> <h:message for="email" />
	</div>
	
	<div>Numero di telefono: <h:inputText value="#{providerController.phoneNumber}" 
                     required="false" />
	</div>
	
	<div>Partita IVA: <h:inputText value="#{providerController.iva}" 
                     required="true"
                     requiredMessage="La partita IVA è un campo obbligatorio"
                     id="iva"/> <h:message for="iva" />
	</div>
    <br /> 
    
    <h2>Inserisci l'indirizzo del fornitore</h2>
    
    <div>Via/Piazza: <h:inputText value="#{providerController.street}"
    				required="true"
    				requiredMessage="L' indirizzo è un campo obbligatorio"
    				id="street"/> <h:message for="street" /> 
    </div> 
    <div>Città: <h:inputText value="#{providerController.city}"
    				required="true"
    				requiredMessage="La città è un campo obbligatorio"
    				id="city"/> <h:message for="city" /> 
    </div>
    <div>Stato/Provincia: <h:inputText value="#{providerController.state}"
    				required="true"
    				requiredMessage="la provincia è un campo obbligatorio"
    				id="state"/> <h:message for="state" /> 
    </div>  
    <div>CAP: <h:inputText value="#{providerController.zipcode}"
    				required="true"
    				requiredMessage="Il CAP è un campo obbligatorio"
    				id="zipcode"/> <h:message for="zipcode" /> 
    </div> 
    <div>Paese: <h:inputText value="#{providerController.country}"
    				required="true"
    				requiredMessage="Il paese è un campo obbligatorio"
    				id="country"/> <h:message for="country" /> 
    </div> 
    
    <br />
    
	<div>
		<h:commandButton value="Inserisci Fornitore"  action="#{providerController.createProvider}"/>
	</div>
</h:form>
</f:view>
</body>
</html>