<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>findMemberById.jsp</title>
</head>
<body>
<h3>아이디로 회원검색</h3>
<form action = "DispatcherServlet">
	아이디 <input type = "text" name = "id">
	<input type = "hidden" name = "command" value = "findById">
	<input type = "submit" value = "아이디로 회원검색">
</form>
</body>
</html>