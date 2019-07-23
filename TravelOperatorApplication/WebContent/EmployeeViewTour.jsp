<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.training.process.*,com.training.model.Tour,java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Tour List</title>
<link type="text/css" rel="stylesheet" href="style/EmployeeViewTour.css">
</head>
<body>

<form action="GetUpdateTour.in" method="post">
	<table>
		<tr>
			<!-- <th>Tour Id</th> -->
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
		
		
		<%-- <c:url var="tourId" value="${tourList.tourId}"/>
			 --%>
		<%-- <jsp:useBean id="LIST_TOUR" class="com.training.process.ViewTour" scope="session"/> --%>
		<c:forEach var="tourList" items="${requestScope.list}">
		<%-- 
		<c:url var="delete" value="DeleteTour.in">
			<c:param name="tourId" value="${tourList.tourId}"/>
		</c:url> --%>
		
	<%-- 	<c:url var="update" value="GetUpdateTour.in">
			<c:param name="tourId" value="${tourList.tourId}"/>
		</c:url> --%>
		
		<%-- <c:set var="updateList" value="${tourList}" scope="session"/> --%>
			<tr>
				<%-- <td>${tourList.tourId}</td> --%>
				<td>${tourList.tourCode}</td>
				<td>${tourList.tourName}</td>
				<td>${tourList.boardingPlace}</td>
				<td>${tourList.destinationPlace}</td>
				<td>${tourList.startingDate}</td>
				<td>${tourList.endingDate}</td>
				<td>${tourList.placesCovered}</td>
				<td>${tourList.amountPerPerson1}</td>
				<%-- <td><a href="${update}"><button class="btSize">Update</button></a>
				<a href="${delete}" 
				onclick="if (!(confirm('Are you sure you want to delete this ${tourList.tourCode}')))
				 return false"><button class="btSize">Delete</button></a></td> --%>
				 <td><button class="btSize" name="tourId" value="${tourList.tourId}">Update</button></td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>