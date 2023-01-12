<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Students</title>
</head>
<body>
	<h1>Display All Students</h1>
	<table border=1 width=100%>
		<tr><th>Student_Id</th><th>Student_Name</th><th>Student_Age</th><th>Student_Address</th><th>Course</th></tr>
		<c:forEach var="student" items="${Students}">
			<tr>
				<td>${student.sId}</td>
				<td>${student.sName}</td>
				<td>${student.sAge}</td>
				<td>${student.sAddress}</td>
				<td>${student.sCourse}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>