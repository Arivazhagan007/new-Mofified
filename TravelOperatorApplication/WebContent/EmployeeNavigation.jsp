<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Navigation</title>
<link type="text/css" rel="stylesheet" href="style/EmployeeNavigation.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="rightDiv">
	<c:set var="name" value="Welcome ${sessionScope.userName}" scope="session"/>
	<c:out value="${name}"/>
</div>
<div>
	<form action="ViewTour.in" method="post">
		<input type="submit" value="ViewAllTour" class="fullSize2 border showList hoverColor">
	</form>
	
	<form action="Logout.action"  method="post">
		<input type="submit" value="Logout" class="fullSize1 border showList hoverColor">
	</form>
	<form action="AddTour.jsp"  method="post">
		<input type="submit" value="AddTour" class="fullSize1 border showList hoverColor">
	</form>
</div>


</body>
</html>