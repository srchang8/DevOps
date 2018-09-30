<%--
  Created by IntelliJ IDEA.
  User: stephenchang
  Date: 9/23/18
  Time: 9:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <P>The time on the server is ${serverTime}.</p>

    <form action="user" method="post">
        <input type="text" name="userName"><br> <input
            type="submit" value="Login">
    </form>

</html>
