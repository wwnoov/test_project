<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<a href="/">홈</a>
<form action="/member/login" method="post">
    <input type="text" name="memberEmail" placeholder="이메일">
    <input type="text" name="memberPassword" placeholder="비밀번호">
    <input type="submit" value="로그인">
</form>
</body>
</html>