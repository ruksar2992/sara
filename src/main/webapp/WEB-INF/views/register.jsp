<%@taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
h2{text-align:center;}
</style>

</head>
<body>
<c:form action="/BusProject/add"  method="post"  modelAttribute="user">

<div>
  <h2>Registration Details</h2>
  <center>
  <table>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" /></td>
            </tr>
            <tr>
                <td>password</td>
                <td><input type="password" name="password" /></td>
            </tr>
            
            <tr>
                <td>Number</td>
                <td><input type="text" name="phoneNo" /></td>
            </tr>
            <tr>
                <td>email</td>
                <td><input type="email" name="eMail" /></td>
            </tr>
        </table>
        <input type="submit" value="Register" />
        <center/>
    </div>
    </c:form>
</body>
</html>