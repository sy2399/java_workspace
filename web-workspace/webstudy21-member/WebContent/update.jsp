<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
</head>
<body>
<h3>회원정보수정</h3>
<form action="DispatcherServlet">
	<% MemberVO vo = (MemberVO)session.getAttribute("vo"); %>
	아이디 <input type ="text" name = "id" value="<%=vo.getId()%>" readonly="readonly"><br>
	비밀번호<input type = "password" name = "pw"><br>
	이름<input type = "text" name = "name"><br>
	주소<input type = "text" name = "address"><br>
	<input type= "hidden" name = "command" value = "update">
	<input type = "submit" value = "회원정보수정">
</form>
</body>
</html>