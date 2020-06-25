<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<h2>Bus Details</h2>
	 <table border ="2">
	<center>
		<tr>
				<th>busno</th>
				<th>companyname</th>
				<th>seats</th>
				<th>bustype</th>
				<th>Search</th>
		</tr>
			<c:forEach var="Bus" items="${rList}">
				<tr>
					<td><c:out value="${Bus.busno}" /></td>
					<td><c:out value="${Bus.companyname}" /></td>
					<td><c:out value="${Bus.seats}" /></td>
					<td><c:out value="${Bus.bustype}" /></td>
			<td><a href="busList?busid=${Bus.busid}&busno=${Bus.busno}">search</a><br>
				</tr>
			</c:forEach>
	</center>
	</table>
</body>
</html>







