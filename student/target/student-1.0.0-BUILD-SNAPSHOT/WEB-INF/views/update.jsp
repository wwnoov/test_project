<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<a href="/">홈</a>
<h1>점수 정정</h1>
<form action="/student/update" method="post" name="updateForm">
    학번: <input type="text" name="studentId" value="${student.studentId}"readonly> <br/>
    이름: <input type="text" name="studentName" value="${student.studentName}"readonly> <br/>
    국어: <input type="text" name="korean" id="korean"  value="${student.korean}"autofocus> <br/>
    영어: <input type="text" name="english" value="${student.english}">  <br/>
    수학: <input type="text" name="math" value="${student.math}">  <br/>
    <input type="button" value="수정" onclick="update()">
</form>
</body>
<script>
    const update = () => {
        document.updateForm.submit();
    }
</script>
</html>