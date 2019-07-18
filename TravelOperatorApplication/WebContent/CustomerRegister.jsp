<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Register</title>
<link type="text/css" rel="stylesheet" href="style/style.css">
<link href="image/Login.jpg" type="image/jpg" rel="icon">
</head>
<body>
<form action="CustomerRegister.in" method="post">
<jsp:include page="Register.jsp"/>
	<div class="registerPadding centerText2">
			<input type="reset" value="Reset" class="buttonSize"/>
			<input type="submit" value="Submit" class="buttonSize"/>
	</div>
</form>
</body>
</html>