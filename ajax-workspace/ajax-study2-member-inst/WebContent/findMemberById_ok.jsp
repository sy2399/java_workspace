<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="model.MemberVO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>검색결과</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<a href="index.jsp">홈</a><hr>
	<%
		MemberVO vo = (MemberVO) request.getAttribute("vo");
	%>
	회원 검색 결과 :
	<%=vo.getId()%>
	<%=vo.getName()%>
	<%=vo.getAddress()%>

</body>
</html>










