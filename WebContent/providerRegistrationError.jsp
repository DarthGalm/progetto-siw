<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Errore registrazione!</title>
</head>
<body>
<h2>Errore!</h2>
<br />
<h4>Esiste già un fornitore registrato con questa Email, <a href='<c:url value="/faces/newProvider.jsp" />'>clicca qui</a> e riprova con una email differente.</h4>
</body>
</html>