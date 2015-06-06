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
	<h1>Inserisci i tuoi dati</h1>
	<br />
	
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
    <div>Password: <h:inputSecret value="#{customerController.password}" 
    				required="true"
                     requiredMessage="La password è un campo obbligatorio"
                     id="password"/> <h:message for="password" />
    </div>
    
    <br /> 
    
    <h2>Inserisci il tuo indirizzo completo</h2>
    
    <div>Via/Piazza: <h:inputText value="#{customerController.street}"
    				required="true"
    				requiredMessage="L' indirizzo è un campo obbligatorio"
    				id="street"/> <h:message for="street" /> 
    </div> 
    <div>Città: <h:inputText value="#{customerController.city}"
    				required="true"
    				requiredMessage="La città è un campo obbligatorio"
    				id="city"/> <h:message for="city" /> 
    </div>
    <div>Stato/Provincia: <h:inputText value="#{customerController.state}"
    				required="true"
    				requiredMessage="la provincia è un campo obbligatorio"
    				id="state"/> <h:message for="state" /> 
    </div>  
    <div>CAP: <h:inputText value="#{customerController.zipcode}"
    				required="true"
    				requiredMessage="Il CAP è un campo obbligatorio"
    				id="zipcode"/> <h:message for="zipcode" /> 
    </div> 
    <div>Paese: <h:inputText value="#{customerController.country}"
    				required="true"
    				requiredMessage="Il paese è un campo obbligatorio"
    				id="country"/> <h:message for="country" /> 
    </div> 
    
    <br />
    
	<div>
		<h:commandButton value="Registrati"  action="#{customerController.createCustomer}"/>
	</div>
</h:form>
</f:view>
</body>
</html>