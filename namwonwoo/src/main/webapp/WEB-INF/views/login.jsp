<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>로그인</title>
</head>
<body>
<a href="/">홈</a>
    <form action="/student/login" method="post">
        <p>ID : <input type="text" name="studentId" autofocus required></p>
        <p>PW : <input type="password" name="password" required></p>
        <input type="submit" value="로그인">
    </form>
</body>
</html>
