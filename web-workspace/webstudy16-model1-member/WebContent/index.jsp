<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>HOME</title>
</head>
<body>
	<h3>HOME</h3>
	<a href = "findMemberById.jsp">아이디로 회원검색</a><br>
	<a href = "findMemberByAddress.jsp">주소로 회원검색</a><br>
<%
//로그인 인증 정보(세션 attribute 의 memberVO 존재 유뮤)
MemberVO vo = (MemberVO)session.getAttribute("memberVO");
%>
<%if(vo==null){ %>
	
	<a href = "login.jsp">로그인</a>
	
<%}else{ %>
	
	 <%=vo.getName() %>님 로그인<br>
	 
	 <a href = "logout.jsp">로그아웃</a><br>
	 <a href = "cafe.jsp">카페가기</a><br>
	 <a href = "update.jsp">회원정보수정</a><br>
	<%} %>	
	<!-- <form action = "findMemberById.jsp">
		<input type = "submit" value = "회원검색">
	</form> -->
</body>
</html>