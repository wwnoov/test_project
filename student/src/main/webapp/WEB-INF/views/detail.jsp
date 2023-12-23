<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
    <title>detail</title>
</head>
<body>
<a href="/">홈</a>
<h1>학생 정보</h1>

<table>
    <tr>
        <th>StudentId</th>
        <td>${student.studentId}</td>
    </tr>
    <tr>
        <th>StudentName</th>
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
        <button onclick="updateMember('${student.studentId}')">수정</button>
    </td>
    <td>
        <input type="button" value="삭제하기" id="deleteBtn" >
    </td>
</table>

</body>
<script>
    $("#deleteBtn").on("click", function() {
        let check = confirm("삭제하시겠습니까?");
        if (check == true) {
            $.get("/student/delete?studentId=${student.studentId}", function() {
                alert("삭제되었습니다.");
                location.href = "/student/list";
            }).fail(function() {
                alert("삭제 실패했습니다.");
            });
        }
    });
    const updateMember = (studentId) => {
        console.log(studentId);
        location.href = "/student/update?studentId="+studentId;
    }
</script>
</html>