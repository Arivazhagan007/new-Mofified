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
<link type="text/css" rel="stylesheet" href="style/bg.css">
</head>
<body class="homeBackgroundPic">
<%
response.setHeader("Cache-Control","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0);
%>
<c:if test="${sessionScope.userName==null}"> 
<c:redirect url="CustomerLoginView.action"/> 
</c:if>

	<div>
		<jsp:include page="Header.jsp"/>
	</div>
	
	<div>
		<jsp:include page="CustomerNavigation.jsp"/>
	</div>
	<div>
		<jsp:include page="CustomerViewTour.jsp"/>
	</div>
	<div class="footerMarginPosition">
		 <jsp:include page="Footer.jsp"/>
	</div>
	
	
</body>
</html>