<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인OK</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<a href="index.jsp">홈</a><hr>
	<%
		MemberVO vo = (MemberVO) session.getAttribute("mvo");
		if (vo != null) {
	%>
	<%=vo.getName()%>님 로그인 성공!
	<a href="cafe.jsp">카페입장하기</a>
	<%
		} else {
	%>
	<script type="text/javascript">
		alert("로그인하세요");
		location.href = "index.jsp";
	</script>
	<%
		}
	%>
</body>
</html>