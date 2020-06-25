<%@taglib uri="http://www.springframework.org/tags/form" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:form action="/BusProject/login"  method="post"  modelAttribute="user">
  <h1>Login</h1>
  <table>
  <tr>
                <td>Name</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>password</td>
                <td><input type="password" name="password" /></td>
            </tr>
            
            </table>
        <input type="submit" value="Login" />
        <a href="/BusProject/register">register</a>
       <!--  <a href="register.jsp">click here to create newAccount</a> -->
    </c:form>
</body>
</html>
