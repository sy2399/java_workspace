<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>findMemberByAddress.jsp</title>
</head>
<body>
	<h3>회원검색</h3>
	<form action = "findMemberByAddress_action.jsp">
	주소 <input type = "text" name = "address" required="required">
	<input type = "submit" value = "검색">
	</form>
</body>
</html>