<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
<% 	MemberVO vo = (MemberVO)session.getAttribute("vo");
	if(vo!=null){
%>
			<%=vo.getName() %> 님 로그인OK <br>
			
			<a href="cafe.jsp">카페가기</a>
			<hr>
			<a href="index.jsp">홈으로</a>
<%} %>
</body>
</html>