<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<a href="index.jsp">홈</a>
	<hr>
	<form name="loginForm" method="post" action="DispatcherServlet">
		<input type="hidden" name="command" value="login"> 아이디 : <input
			type="text" name="memberId" required="required"><br> 패스워드 : <input
			type="password" name="memberPass" required="required"><br> <input
			type="submit" value="로그인">
	</form>
</body>
</html>