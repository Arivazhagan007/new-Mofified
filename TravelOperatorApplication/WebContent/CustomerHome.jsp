<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Home</title>
<link type="text/css" rel="stylesheet" href="style/CustomerHome.css">
</head>
<body>

	<div>
		<jsp:include page="Header.jsp"/>
	</div>
	
	<div>
		<jsp:include page="CustomerNavigation.jsp"/>
	</div>
	<div>
		<jsp:include page="CustomerViewTour.jsp"/>
	</div>
	<div>
		 <jsp:include page="Footer.jsp"/>
	</div>
</body>
</html>