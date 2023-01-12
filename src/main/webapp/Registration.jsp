<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
	Name:<input type="text" name="sName"><br><br>
	Age:<input type="number" name="sAge"><br><br>
	Address<textarea rows="5" cols="30" name="sAddress"></textarea><br><br>
	Course:<select name="sCourse">
		<option value="B.Com">B.com</option>
		<option value="M.Com">M.com</option>
		<option value="B.E">B.E</option>
		<option value="B.Tech">B.Tech</option>		
	</select><br><br>
	<input type="submit" value="Register">
	<input type="reset" value="clear">
	</form>
	<a href="viewAllStudents">View AllStudents</a>
</body>
</html>