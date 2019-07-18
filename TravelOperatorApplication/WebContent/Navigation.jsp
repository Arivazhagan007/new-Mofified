<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Navigation</title>
<link type="text/css" rel="stylesheet" href="style/style.css">
</head>
<body>
<div class="rightDiv navTextColor">
	<ul class="ulList">
		<li class="ulliList border backgroundColor showList"><a>Login</a>
			<ul class="ulList">
				<li class="ulliList hideList backgroundColor"><a href="CustomerLoginView.in">User Login</a></li>
				<li class="ulliList hideList backgroundColor"><a href="EmployeeLoginView.in">Employee Login</a></li>
			</ul>
		</li>
		<li class="ulliList border backgroundColor showList"><a>Register</a>
			<ul class="ulList ">
				<li class="ulliList hideList backgroundColor"><a href="CustomerRegisterView.in">User Register</a></li>
				<li class="ulliList hideList backgroundColor"><a href="EmployeeRegisterView.in">Employee Register</a></li>
			</ul>
		</li>
	</ul>
</div>
</body>
</html>