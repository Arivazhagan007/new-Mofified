<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login</title>
<link href="image/Login.jpg" type="image/jpg" rel="icon">
<link type="text/css" rel="stylesheet" href="style/style.css">
<script
  src="http://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous">
</script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#employeeLoginForm').submit(function(){
			event.preventDefault();
			var form = $(this).serialize();
			$.ajax({
				url: "EmployeeLogin.in", 
				data: form,
				type: 'POST', 
				success: function(uri){ 
				location.href = "EmployeeHome.jsp"
				},
				error: function(xhr,status,error){
				alert('please check Your UserName and PassWord');
				}
			});
		});
	});
</script>
</head>
<body class="loginBg">
<form action="EmployeeLogin.in" method="post" id="employeeLoginForm">
<jsp:include page="Login.jsp"/>
<div class="centerText1">
			<input type="reset" value="Reset" class="buttonSize"/>
			<input type="submit" value="Login" class="buttonSize"/>
</div>
</form>
</body>
</html>