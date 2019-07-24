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
<body class="bookTourReciptbg">
<div>
	<jsp:include page="Header.jsp"/>
</div>
<form action="Logout.action" method="post">
	<div class="floatLoginRight">
		<input type="submit" value="Logout" class="btnLogoutSize">
	</div>
</form>
<div>
	<table>
		<tr>
			<th>Customer Name</th>
			<th>Tour Code</th>
			<th>Starting Place</th>
			<th>Ending Place</th>
			<th>Starting Date</th>
			<th>Ending Date</th>
			<th>Count Of Members</th>
			<th>Total Amount</th>
			<!-- <th>Customer Name</th>
			<th>Tour Id</th>
			<th>Count Of Members</th>
			<th>Total Amount</th> -->
		</tr>
		<tr>
			<td>${name}</td>
			<td>${tourListValue.tourCode}</td>
			<td>${tourListValue.boardingPlace}</td>
			<td>${tourListValue.destinationPlace}</td>
			<td>${tourListValue.startingDate}</td>
			<td>${tourListValue.endingDate}</td>
			<c:forEach var="receipt" items="${requestScope.list}">
				<td>${receipt.countOfMembers}</td>
				<td>${receipt.amount}</td>
			</c:forEach>
		</tr>
		
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