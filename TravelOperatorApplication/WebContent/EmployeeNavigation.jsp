<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Navigation</title>
<link type="text/css" rel="stylesheet" href="style/EmployeeNavigation.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<!-- <div>
	<nav>
		
		<a class="fullSize2 border showList hoverColor">Logout</a>
	</nav>
</div> -->
<div>
	<form action="ViewTour.in" method="post">
		<input type="submit" value="ViewAllTour" class="fullSize2 border showList hoverColor">
	</form>
	<form action="AddTour.jsp"  method="post">
		<input type="submit" value="AddTour" class="fullSize1 border showList hoverColor">
	</form>
	<form action="#"  method="post">
		<input type="submit" value="Logout" class="fullSize1 border showList hoverColor">
	</form>
</div>
<!-- <ul class="ulList">
	<li class="fullSize2 whiteColor backgroundColor"><a>Delete</a></li>
	<li class="fullSize2 whiteColor backgroundColor"><a>Update Tour</a></li>
	<li class="fullSize2 whiteColor backgroundColor"><a href="AddTour.jsp">Add Tour</a></li>
</ul> -->
		
<!-- <div class="rightDiv navTextColor ulList marginRight">

	<input type="text" name="sourcePlace" id="sourcePlace" required="required" placeholder="Enter the Tour Starting place" class="fullSize border showList">
	<input type="text" name="destinationPlace" id="destinationPlace" required="required" placeholder="Enter the Tour Ending place" class="fullSize border showList">
	<a><button type="submit" class="fullSize1 border showList"><i class="fa fa-search"></i></button></a>
</div> -->

</body>
</html>