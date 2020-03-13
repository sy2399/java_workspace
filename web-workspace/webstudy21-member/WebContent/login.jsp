<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h3>로그인</h3>

<form action="DispatcherServlet">
	아이디<input type = "text" name = "id"><br>
	비밀번호<input type = "password" name = "pw"><br>
	<input type = "hidden" name = "command" value = "login">
	<input type = "submit" value = "로그인">
</form>


</body>
</html>