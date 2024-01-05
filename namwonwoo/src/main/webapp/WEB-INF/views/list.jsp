<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<a href="/">홈</a>
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
</html>
