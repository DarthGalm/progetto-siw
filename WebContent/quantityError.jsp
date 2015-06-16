<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Errore quantità!</title>
</head>
<f:view>
<h:form>
<body>
<h2>Attenzione!</h2>
<br />
<h3>La quantità non è disponibile in magazzino,<h:commandLink value="clicca qui" action="newOrder"/> e riprova.</h3>

</h:form>
</f:view>
</body>
</html>