<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Nuovo Cliente registrato</title>
</head>
<body>
<f:view>
<h1>Registrazione effettuata con successo</h1>


<div>Nome: ${customerController.customer.firstname}</div>
<div>Cognome: ${customerController.customer.lastname}</div>
<div>Data di nascita: ${customerController.customer.dateOfBirth}</div>
<div>Indirizzo eMail: ${customerController.customer.email}</div>
<div>Address Placeholder: </div>

</f:view>
</body>
</html>