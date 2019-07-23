<%@page import="com.training.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Login</title>
<link href="image/Login.jpg" type="image/jpg" rel="icon">
<link type="text/css" rel="stylesheet" href="style/style.css">
<script
  src="http://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous">
</script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#customerLoginForm').submit(function(){
			event.preventDefault();
			var form = $(this).serialize();
			$.ajax({
				url: "CustomerLogin.in", 
				data: form,
				type: 'POST', 
				success: function(uri){ 
				location.href = "CustomerHome.action"
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

<form action="CustomerLogin.in" id="customerLoginForm" method="post">
<jsp:include page="Login.jsp"/>
<%-- <%@ include file= "Login.html"%> --%>
<div class="centerText1">
			<input type="reset" value="Reset" class="buttonSize"/>
			<input type="submit" value="Login" class="buttonSize"/>
</div>
</form>

</body>
</html>