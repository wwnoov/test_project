<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>로그인</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>
</head>
<body>
<div class="container">
	<form class="form-signin" method="post" action="/chap08_war_exploded/login">
		<h2 class="form-signin-heading">로그인</h2>
		<label  class="sr-only">사용자명 </label>
		<input type="text" name="username" placeholder="username"  class="form-control" required autofocus>
		<label  class="sr-only">비밀번호</label>
		<input type="password" name="password" 	placeholder="password" class="form-control" required>
	<p><button type="submit" class="btn btn-lg btn-primary btn-block">로그인</button>
	<input type="hidden" name="${_csrf.parameterName}" 	value="${_csrf.token}" />
</form>
</div>
</body>
</html>