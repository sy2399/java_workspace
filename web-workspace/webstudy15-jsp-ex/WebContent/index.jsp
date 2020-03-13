<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>jsp session index</title>
</head>
<body>
<%--로그인 폼을 제공 --%>
<%
//로그인 인증 정보(세션 attribute 의 memberVO 존재 유뮤)
MemberVO vo = (MemberVO)session.getAttribute("memberVO");
%>

<%if(vo==null){ %>

	<form action = "login_action.jsp"  method = "post" name = "loginForm">
	ID <input type = "text" name = "id" required="required"><br>
	PW <input type = "password" name = "pw" required="required"><br>
	<input type = "submit" value = "로그인">
	</form>

<%}else{ %>

	<form action = "logout.jsp">
	 <%=vo.getName() %>님 로그인<br>
	 
	<input type = "submit" value = "로그아웃">
	</form>
	<%} %>

</body>
</html>