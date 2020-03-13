<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카페</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<a href="index.jsp">홈</a><hr>
	<%
		if (session.getAttribute("mvo") == null) {
	%>
	<script type="text/javascript">
		alert("로그인하셔야 카페입장 가능!");
		location.href = "login.jsp";
	</script>
	<%
		}
	%>
	<%
		MemberVO vo = (MemberVO) session.getAttribute("mvo");
		if (vo != null) {
	%>
	<%=vo.getAddress()%>에 사는
	<%=vo.getName()%>님 카페 입장 환영!
	<a href="DispatcherServlet?command=logout">로그아웃</a>
	<%
		}
	%>
</body>
</html>







