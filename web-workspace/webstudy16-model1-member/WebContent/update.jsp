<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>update.jsp</title>
</head>
<body>
<h3>회원정보수정</h3>
<form action = "update_action.jsp" method="post">
<%MemberVO vo = (MemberVO)session.getAttribute("memberVO"); %>
	아이디: <input type ="text" name = "id" readonly="readonly" value = "<%=vo.getId()%>">
	패스워드: <input type = "text" name = "pw" required="required">
	이름: <input type = "text" name = "name" required="required">
	주소: <input type = "text" name = "address" required="required">
	<input type = "submit" value = "회원정보수정">
</form>
</body>
</html>