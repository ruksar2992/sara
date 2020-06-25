<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<h2>Bus Schedule Details</h2>
	<table border ="2">
		<center>
			<tr>
                <th>busno</th>
                <th>depatureDateTime</th>
                  <th>Duration</th> 
                   <th>Search</th>
            </tr>
            
				
        <c:forEach var="BusSchedule" items="${busSchdule}">
                <tr>
                <td><p>${BusSchedule.busno}</p></td>
                  <td><c:out value="${BusSchedule.depatureDateTime}" /></td>
                   <td><c:out value="${BusSchedule.duration}" /></td>
                   <td><a href="tickedList?scheduleid=${BusSchedule.scheduleid}&source=${BusSchedule.source}&destination=${BusSchedule.destination}">search</a><br>  
                </tr>
            </c:forEach>
            </center>
        </table>  
</body>
</html>