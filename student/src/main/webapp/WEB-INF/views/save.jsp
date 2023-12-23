<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>save</title>
    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
</head>
<body>
<a href="/">홈</a>
<form action="/student/save" method="post">
    <p>학번 : <input type="text" name="studentId" placeholder="학번" id="studentId" onblur="idCheck()"></p>
    <p id="check-result"></p>
    <p>이름 : <input type="text" name="StudentName" placeholder="이름"></p>
    <p>국어 : <input type="text" name="korean" placeholder="국어"></p>
    <p>영어 : <input type="text" name="english" placeholder="영어"></p>
    <p>수학 : <input type="text" name="math" placeholder="수학"></p>
    <input type="submit" value="입력">
    <input type="reset" value="초기화">
</form>
</body>
<script>
    // 이메일 입력값을 가져오고,
    // 입력값을 서버로 전송하고 똑같은 이메일이 있는지 체크한 후
    // 사용 가능 여부를 이메일 입력창 아래에 표시
    const idCheck = () => {
        const studentId = document.getElementById("studentId").value;
        const checkResult = document.getElementById("check-result");
        console.log("입력한 학번", studentId);
        $.ajax({
            // 요청방식: post, url: "email-check", 데이터: 이메일
            type: "post",
            url: "/student/id-check",
            data: {
                "studentId": studentId
            },
            success: function(res) {
                console.log("요청성공", res);
                if (res == "ok") {
                    console.log("등록가능한 학번");
                    checkResult.style.color = "green";
                    checkResult.innerHTML = "등록가능한 이메일";
                } else {
                    console.log("이미 등록한 학번");
                    checkResult.style.color = "red";
                    checkResult.innerHTML = "이미 등록한 학번";
                }
            },
            error: function(err) {
                console.log("에러발생", err);
            }
        });
    }
</script>
</html>