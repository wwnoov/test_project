<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>main</title>
</head>
<body>
<a href="/">홈</a>
<h2>${sessionScope.loginId} 님 환영합니다.</h2>
<button onclick="update()">내정보 수정하기</button>
<button onclick="logout()">로그아웃</button>
</body>
<script>
  const update = () => {
    location.href = "/student/update";
  }
  const logout = () => {
    location.href = "/student/logout";
  }
</script>
</html>
