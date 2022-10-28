<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management</title>
</head>
<body>
	<h1>Employee Details</h1>
	
	<h2>Add Employee to DATA BASE</h2>
	<form action="addEmp">
	<h4>	Employee id </h4>	<input type="text" name="id"> <br> 
	<h4>	Employee Name </h4>	<input type="text" name="name"> <br> 
	<h4>	Employee Salary </h4>	<input type="text" name="salary"> <br> 
		<h5> 	</h5>
		<input type="Submit"> <br>
	</form>
	
<h2>GET Employee Details from DATA BASE</h2>
	
	<form action="getEmp">
		<h4>Employee id</h4>
		<input type="text" name="id"> <br>

		<h5></h5>
		<input type="Submit"> <br>
	</form>
</body>
</html>