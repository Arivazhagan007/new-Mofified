<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Navigation</title>
<link type="text/css" rel="stylesheet" href="style/CustomerNavigation.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<form action="SearchTour.in" method="post">
	<input type="text" name="sourcePlace" id="sourcePlace" required="required" placeholder="Enter the Tour Starting place" class="enterSize border TextColor bgcolor">
	<input type="text" name="destinationPlace" id="destinationPlace" required="required" placeholder="Enter the Tour Ending place" class="enterSize border TextColor bgcolor">
	<button type="submit" class="searchbtn border bgcolor"><i class="fa fa-search"></i></button>
</form>
<div class="margineTop">
	<a class="floatRight"><button type="submit" class="loginbtn bgcolor">Logout</button></a>
	<h3 class="floatRight paddingright">Welcome ${userName}</h3>
</div>
</body>
</html>