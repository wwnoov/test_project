<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<a href="/">홈</a>
<form action="/teacher/login" method="post">
    <input type="text" name="id" placeholder="아이디">
    <input type="text" name="password" placeholder="비밀번호">
    <input type="submit" value="로그인">
</form>
</body>
</html>