<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정결과화면</title>
</head>
<body>
<a href="index.jsp">홈</a><hr>
	<%
		MemberVO vo = (MemberVO) session.getAttribute("mvo");
	%>
	<%=vo.getName()%>님 회원정보를 수정하였습니다!
	<br> 수정 정보
	<br> 아이디 :
	<%=vo.getId()%>
	<br> 패스워드 :
	<%=vo.getPassword()%>
	<br> 이름 :
	<%=vo.getName()%>
	<br> 주소 :
	<%=vo.getAddress()%>	
</body>
</html>