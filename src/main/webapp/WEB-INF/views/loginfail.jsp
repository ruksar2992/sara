<%@taglib uri="http://www.springframework.org/tags/form" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style>
div.ex {
    text-align: right width:100px;
    padding: 4px;
    border: 4px solid grey;
    background-color: #FFFFE0;
    margin: 0px
}
</style>
<body>
    <div align="center" class="ex">
        <h1 style="color: red">
        <b>incorrect username or password/Register for new account or else Enter correct username and password </b>
        </h1>
         <form action="/BusProject/login" method="post" modelAttribute="user">
          <h1><a href="/BusProject/register" style="color: green">register</a></h1>
          <h1><a href="/BusProject" style="color: green">login</a></h1>
        </form>
        </div>
</body>
</html>