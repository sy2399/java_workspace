<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>model2 review</title>
</head>
<body>
<%--
	forward와 redirect 이동방식 복습
	-forward
--%>
	<form method = "post" action = "DispatcherServlet">
		닉네임 <input type = "text" name = "nick">
		<input type = "hidden" name = "command" value = "update">
		<input type = "submit" value = "수정하기">
		
	</form>
</body>
</html>