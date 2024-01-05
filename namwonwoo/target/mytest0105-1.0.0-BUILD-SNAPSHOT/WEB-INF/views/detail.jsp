<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>detail</title>
</head>
<body>
<a href="/">홈</a>
    <table>
        <tr>
            <th>학번</th>
            <td>${student.studentId}</td>
        </tr>
        <tr>
            <th>이름</th>
            <td>${student.studentName}</td>
        </tr>
        <tr>
            <th>국어</th>
            <td>${student.korean}</td>
        </tr>
        <tr>
            <th>영어</th>
            <td>${student.english}</td>
        </tr>
        <tr>
            <th>수학</th>
            <td>${student.math}</td>
        </tr>
        <td>
        <button onclick="updateStudent('${student.studentId}')">수정</button>
        <button onclick="deleteStudent('${student.studentId}')">삭제</button>
        </td>
    </table>
    <script>
        const deleteStudent = (studentId) => {
            location.href="/student/delete?studentId="+studentId;
        }
        const updateStudent = (studentId) => {
            location.href="/student/update?studentId="+studentId;
        }
    </script>
</body>
</html>
