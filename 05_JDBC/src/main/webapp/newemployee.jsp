<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee CRUD</title>
</head>
<body>
<h3>Add New Employee </h3>
<form action="AddEmployeeServlet" method="post">
Employee Id<input type="text" placeholder="enter your id" name="employeeid">
<br><br> 
Name<input type=" text" placeholder="enter your name" name="employeename">
<br><br>
Salary<input type=" text" placeholder="enter your salary" name="salary">
<br><br>
<input type="submit" value="Add Employee">

</form>
</body>
</html>