<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Errore Login!</title>
</head>
<f:view>
<body>
<h2>Errore!</h2>
<br />
<h4>Email o password errati, <a href='<c:url value="/faces/login.jsp" />'>clicca qui</a> e riprova.</h4>
</body>
</f:view>
</html>