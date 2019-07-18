<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link type="text/css" rel="stylesheet" href="style/style.css">
</head>
<body class="loginBg">
<fieldset class="loginForm">
	<h2 class="centerTextHeader">Login Here</h2>
		<div >
			<img alt="login" src="image/loginLogo.jpg" class="logoImage">
		</div>
		<div >	
			<label for="userName" class="textSize">User Name</label>
			<input type="text" name="userName" id="userName" required="required" placeholder="Enter the UserName" class="fullSize"/>
		
		</div>
		<div class="paddingTop paddingBottom">
			<label for="passWord" class="textSize">Password</label>
			<input type="password" name="passWord" id="passWord" required="required" placeholder="Enter the PassWord" class="fullSize"/>
		</div>
	</fieldset>
</body>
</html>