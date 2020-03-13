<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
</head>
<body>
<a href="index.jsp">홈</a><hr>
<% MemberVO vo=(MemberVO)session.getAttribute("mvo"); 
	if(vo!=null){
%>
		<h3>회원정보수정</h3>
		<form method="post" name="updateForm" action="DispatcherServlet"
		onsubmit="return checkData()">
		<input type="hidden" name="command" value="update">
		아이디 : <input type="text" name="id" value="<%=vo.getId() %>" readonly>
		<br>패스워드 : <input type="text" name="password" 
		value="<%=vo.getPassword() %>"  required="required">		
		<br>이름 : <input type="text" name="name" 
		value="<%=vo.getName() %>"  required="required">	
		<br>주소 : <input type="text" name="address" 
		value="<%=vo.getAddress() %>" required="required">	
		<br><input type="submit" value="회원정보수정">
		</form>
<%}else{ %>
		<script type="text/javascript">
			alert("로그인하세요!");
			location.href="index.jsp";
		</script>
<%} %>
</body>
</html>