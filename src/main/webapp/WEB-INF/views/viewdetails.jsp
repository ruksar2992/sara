<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h2{text-align:center;}
</style>
</head>
<body>
<form action="/BusProject/details"  method="post"  modelAttribute="user">
<div>
  <h2>Display Details</h2>
  
  <table>
            <tr>
                <td>Source</td>
                <td><input type="text" name="source" /></td>
            </tr>
            <tr>
                <td>Destination</td>
                <td><input type="text" name="destination" /></td>
            </tr>
            
            <tr>
                <td>Date</td>
                <td><input type="text" placeholder="yyyy/mm/dd" name="depatureDate" /></td>
            </tr>
            
        </table>
        <input type="submit" value="search" />
        
    </div>
    </form>
</body>
</html>