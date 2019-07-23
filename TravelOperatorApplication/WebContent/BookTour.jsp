<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Tour</title>
<link type="text/css" rel="stylesheet" href="style/bookTour.css">
</head>
<body class="background">
	<div class="divbgclr">
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
		</tr>
		<c:forEach var="tourList" items="${requestScope.list}">
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
				
		</tr>
		</c:forEach>
	</table>
	</div>
	<form action="BookTour.in" method="post">
		<fieldset class="fieldsetsize">
				<div class="center">
					<label for="count" class="textclr">Enter The Count Of Members <span>:</span></label>
					<input type="text" name="countValue" id="count" required="required" placeholder="Enter the count of Members are Comming" class="fullSize"/>
				</div>
				<div class="center">
					<input type="submit" value="Book" class="buttonSize">
				</div>
		</fieldset>
		<input type="hidden" name="selectedTourId" value="${param.bookTourId}" >
	</form>
	
</body>
</html>