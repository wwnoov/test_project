<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
  <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
  <title>spring</title>
</head>
<body>
<nav class="navbar navbar-expand navbar-dark bg-dark">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="./home">Home</a>
    </div>
  </div>
</nav>
<div class="jumbotron">
  <div class="container">
    <h1 class="display-3">spring</h1>
  </div>
</div>
<div class="container">
  <div class="row" align="center">
    <p>배우는과목 :  ${subject}</p>
    <p>이름 : ${name}</p>
      </div>
  </div>
  <hr>
  <footer>
    <p>&copy; spring</p>
  </footer>
</body>
</html>
