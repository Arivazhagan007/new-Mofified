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
	<form action="BookTour.in" method="post">
	
		<fieldset class="fieldsetsize">
				<div class="center">
					<label for="count" class="textclr">Enter The Count Of Members <span>:</span></label>
					<input type="text" name="countValue" id="count" required="required" placeholder="Enter the count of Members are Comming" class="fullSize"/>
				</div>
				<div class="center">
					<input type="submit" value="Book" class="buttonSize">
				</div>
				<%-- <input type="text" name="tourId" value="${tourIdValue}">
				<c:out value="${tourIdValue}"></c:out> --%>
		</fieldset>
	</form>
</body>
</html>