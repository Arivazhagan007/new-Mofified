<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="style/TourBookedReceipt.css">
<title>receipt</title>
</head>
<body >
<div>
	<jsp:include page="Header.jsp"/>
</div>
<div>
	<table>
		<tr>
			<th>Customer Name</th>
			<th>Tour Id</th>
			<th>Count Of Members</th>
			<th>Total Amount</th>
		</tr>
		<c:forEach var="receipt" items="${requestScope.list}">
			<tr>
				<td>${name}</td>
				<td>${receipt.tourId}</td>
				<td>${receipt.countOfMembers}</td>
				<td>${receipt.totalAmount}</td>
			</tr>
		</c:forEach>
	</table>
</div>
<div class="aligncenter">
	<h1>Happy Journey ${name}</h1>
</div>
<div>
	 <jsp:include page="Footer.jsp"/>
</div>
</body>
</html>