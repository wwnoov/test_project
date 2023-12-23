<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>학점관리</title>
</head>
<body>
<h1>학점관리</h1>
<a href="/">홈</a><br/>
<a href="/teacher/login">로그인</a><br/>
<a href="/student/save">학생등록</a><br/>
<button onclick="serch()">찾기</button>
<table>
    <tr>
        <th>학번</th>
        <th>이름</th>
    </tr>
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td>
                <a href="/student?studentId=${student.studentId}">${student.studentId}</a>
            </td>
            <td>${student.studentName}</td>
        </tr>
    </c:forEach>
</table>

</body>
<script>
    const serch = () => {
        location.href = "/student/serch";
    }
</script>
</html>
