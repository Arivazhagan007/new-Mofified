<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.training.process.ViewTour,com.training.model.Tour,java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Tour List</title>
<link type="text/css" rel="stylesheet" href="style/ViewTour.css">
</head>
<body>
<table>
<tr>
	<th>Tour Id</th>
	<th>Tour Code</th>
	<th>Tour Name</th>
	<th>Boarding Place</th>
	<th>Destination Place</th>
	<th>Starting Date</th>
	<th>Ending Date</th>
	<th>Places Covered</th>
	<th>Amount Per Person</th>
	<th>Action</th>
</tr>
<%
	ViewTour viewTour = new ViewTour();
	List<Tour> tourList = viewTour.showTour();
	request.setAttribute("LIST_TOUR", tourList);
%>

<c:forEach var="tourList" items="${LIST_TOUR}">
	<tr>
		<td>${tourList.tourId}</td>
		<td>${tourList.tourCode}</td>
		<td>${tourList.tourName}</td>
		<td>${tourList.boardingPlace}</td>
		<td>${tourList.destinationPlace}</td>
		<td>${tourList.startingDate}</td>
		<td>${tourList.endingDate}</td>
		<td>${tourList.placesCovered}</td>
		<td>${tourList.amountPerPerson}</td>
		<td><button>${tourId}</button></td>
			
	</tr>
</c:forEach>
</table>
</body>
</html>