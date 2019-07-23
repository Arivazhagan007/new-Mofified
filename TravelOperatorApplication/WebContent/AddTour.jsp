	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Tour</title>
<link type="text/css" rel="stylesheet" href="style/style.css">
</head>
<body class="tourbg">

<form action="AddTour.in"  method="post">
	<fieldset class="toursize">
		<div>
			<h1 class="tourCenter">Add Tour</h1>
		</div>
		<div class="tourPaddingTop">
			<label for="tourCode">Tour Code</label>
			<input type="text" name="tourCode" id="tourCode" required="required" placeholder="Enter the Tour Code" class="tourBoxSize"/>
		</div>
		<div class="tourPaddingTop">
			<label for="tourName">Tour Name</label>
			<input type="text" name="tourName" id="tourName" required="required" placeholder="Enter the Tour Name" class="tourBoxSize"/>
		</div>
		<div class="tourPaddingTop">
			<label for="boardingPlace">Boarding Place</label>
			<input type="text" name="boardingPlace" id="boardingPlace" required="required" placeholder="Enter the Boarding Place" class="tourBoxSize"/>
		</div>
		<div>
			<label for="destinationPlace">Destination Place</label>
			<input type="text" name="destinationPlace" id="destinationPlace" required="required" placeholder="Enter the Destination Place" class="tourBoxSize"/>
		</div>
		<div>
			<label for="startingDate">Starting Date</label>
			<input type="date" name="startingDate" id="startingDate" required="required" placeholder="Enter the Starting Date" class="tourBoxSize"/>
		</div>
		<div>
			<label for="endingDate">Ending Date</label>
			<input type="date" name="endingDate" id="endingDate" required="required" placeholder="Enter the Ending Date" class="tourBoxSize"/>
		</div>
		<div>
			<label for="placesCovered">Places Covered</label>
			<!-- <input type="text" name="placesCovered" id="placesCovered" required="required" placeholder="ENter the Places Covered" class="tourBoxSize"/> -->
			<textarea rows="4" cols="50" name="placesCovered" id="placesCovered" required="required" placeholder="ENter the Places Covered" class="tourBoxSize"></textarea>
		</div>
		<div class="tourPaddingBottom">
			<label for="amountPerPerson">Amount Per Person</label>
			<input type="text" name="amountPerPerson" id="amountPerPerson" required="required" placeholder="Amount Per Person" class="tourBoxSize"/>
		</div>
	</fieldset>
	<div class="tourButtonPosition">
		<input type="reset" value="reset" class="tourButtonSize">
		<input type="submit" value="submit" class="tourButtonSize">		
	</div>
</form>
</body>
</html>