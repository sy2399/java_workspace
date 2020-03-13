<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>아이디로 회원검색 성공</title>
</head>
<body>
<%
	
	MemberVO vo = (MemberVO)request.getAttribute("vo");
	if (vo != null) {
%>
<a href="index.jsp">홈</a>
<hr>
검색 결과 :
<%=vo.getId()%>
<%=vo.getName()%>
<%=vo.getAddress()%>
<%
	} else {
%>
<script type="text/javascript">
    alert("<%=vo.getId()%> 아이디에 해당하는 회원 없음!");
	location.href = "index.jsp";
</script>
<%
	}
%>
</body>
</html>