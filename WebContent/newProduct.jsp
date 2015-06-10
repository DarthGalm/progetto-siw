<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nuovo prodotto</title>
</head>
<body>
<f:view>
<h:form>
	<h1>Inserisci i dati del prodotto</h1>
	<br />
	
    <div>Nome: <h:inputText value="#{productController.name}" 
                     required="true"
                     requiredMessage="Il nome è un campo obbligatorio"
                     id="name"/> <h:message for="name" />
	</div>
	<div>Codice: <h:inputText value="#{productController.code}" 
                     required="true"
                     requiredMessage="Il codice è un campo obbligatorio"
                     id="code"/> <h:message for="code" />
	</div>
	
	<div>Prezzo: <h:inputText value="#{productController.price}" 
                     required="true"
                     converterMessage="Il prezzo deve essere un numero"
                     requiredMessage="Il prezzo è un campo obbligatorio"
                     id="price"/> <h:message for="price" />
	</div>
	<div>Descrizione: <h:inputTextarea value="#{productController.description}" 
                     required="false"
                     cols="20" 
    				 rows="5" />
	</div>
    <div>Quantità in magazzino: <h:inputText value="#{productController.stockQuantity}" 
    				required="true"
    				 converterMessage="La quantità deve essere un numero"
                     requiredMessage="La quantità è un campo obbligatorio"
                     id="stockQuantity"/> <h:message for="stockQuantity" />
    </div>
    
    <br /> 
        
	<div>
		<h:commandButton value="Inserisci"  action="#{productController.createProduct}"/>
	</div>
</h:form>
</f:view>
</body>
</html>