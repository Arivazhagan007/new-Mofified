<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page import="com.training.process.*,com.training.model.Tour,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Tour</title>
<link type="text/css" rel="stylesheet" href="style/style.css">
</head>
<body class="tourbg">

<form action="UpdateTour.in"  method="post">
	<c:forEach var="updateList" items="${requestScope.list}">
		<fieldset class="toursize">
			<div>
				<h1 class="tourCenter">Update Tour</h1>
			</div>
			<div class="tourPaddingTop">
				<label for="tourId">TourId</label>
				<input type="text" name="id" id="tourId" value="${updateList.tourId}" readonly="readonly" class="tourBoxSize"/>
			</div>
			<div class="tourPaddingTop">
				<label for="tourCode">Tour Code</label>
				<input type="text" name="tourCode" id="tourCode" value="${updateList.tourCode}" required="required" placeholder="Enter the Tour Code" class="tourBoxSize"/>
			</div>
			<div class="tourPaddingTop">
				<label for="tourName">Tour Name</label>
				<input type="text" name="tourName" id="tourName" value="${updateList.tourName}" required="required" placeholder="Enter the Tour Name" class="tourBoxSize"/>
			</div>
			<div class="tourPaddingTop">
				<label for="boardingPlace">Boarding Place</label>
				<input type="text" name="boardingPlace" id="boardingPlace" value="${updateList.boardingPlace}" required="required" placeholder="Enter the Boarding Place" class="tourBoxSize"/>
			</div>
			<div>
				<label for="destinationPlace">Destination Place</label>
				<input type="text" name="destinationPlace" id="destinationPlace" value="${updateList.destinationPlace}" required="required" placeholder="Enter the Destination Place" class="tourBoxSize"/>
			</div>
			<div>
				<label for="startingDate">Starting Date</label>
				<input type="date" name="startingDate" id="startingDate" value="${updateList.startingDate1}" required="required" placeholder="Enter the Starting Date" class="tourBoxSize"/>
			</div>
			<div>
				<label for="endingDate">Ending Date</label>
				<input type="date" name="endingDate" id="endingDate"  value="${updateList.endingDate1}" required="required" placeholder="Enter the Ending Date" class="tourBoxSize"/>
			</div>
			<div>
				<label for="placesCovered">Places Covered</label>
				<!-- <input type="text" name="placesCovered" id="placesCovered" required="required" placeholder="ENter the Places Covered" class="tourBoxSize"/> -->
				<textarea  rows="4" cols="50" name="placesCovered" id="placesCovered" required="required" placeholder="ENter the Places Covered" class="tourBoxSize">${updateList.placesCovered}</textarea>
			</div>
			<div class="tourPaddingBottom">
				<label for="amountPerPerson">Amount Per Person</label>
				<input type="text" name="amountPerPerson" id="amountPerPerson" value="${updateList.amountPerPerson}" required="required" placeholder="Amount Per Person" class="tourBoxSize"/>
			</div>
		
		</fieldset>
			<div class="tourButtonPosition">
				<input type="submit" value="Update" class="tourButtonSize">		
			</div>
	</c:forEach>
</form>
</body>
</html>