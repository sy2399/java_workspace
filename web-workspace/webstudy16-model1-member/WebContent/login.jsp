<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<%
//로그인 인증 정보(세션 attribute 의 memberVO 존재 유뮤)
MemberVO vo = (MemberVO)session.getAttribute("memberVO");
%>
<%if(vo==null){ %>
	<form method = "post" action = "login_action.jsp" name = "loginForm">
		아이디	<input type = "text" name = "id" required="required">
		패스워드 <input type = "text" name = "pw" required="required">
		<input type = "submit" value = "로그인">
	</form>
<%}else{ %>
	
	 <%=vo.getName() %>님 로그인<br>
	 <a href = "logout.jsp">로그아웃</a>
	 <a href = "cafe.jsp">카페가기</a>
	<%} %>
</body>
</html>