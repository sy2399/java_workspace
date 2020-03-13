<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList,model.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<a href="index.jsp">홈</a><hr>
	<form name="addressForm" method="get" action="DispatcherServlet">
		<input 	type="hidden" name="command" value="findMemberByAddress">
		주소 <input type="text" name="memberAddress"> <input
			type="submit" value="검색">
	</form>
</body>
</html>









