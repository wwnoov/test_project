<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/">홈</a>

<form action="/student/save" method="post">
    <p>학번 : <input type="text" name="studentId" placeholder="학번" required autofocus></p>
    <p>이름 : <input type="text" name="studentName" placeholder="이름" required ></p>
    <p>국어 : <input type="text" name="korean" placeholder="국어" required ></p>
    <p>영어 : <input type="text" name="english" placeholder="영어" required ></p>
    <p>수학 : <input type="text" name="math" placeholder="수학" required ></p>
    <input type="submit" value="입력">
    <input type="reset" value="초기화">
</form>
</body>
</html>
