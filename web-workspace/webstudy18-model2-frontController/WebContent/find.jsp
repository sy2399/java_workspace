<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find.jsp</title>
</head>
<body>
<form action="DispatcherServlet">
ID <input type="text" name="id">
<input type = "hidden" name = "command" value = "find">
<%--DispatcherServlet에 이 jsp가 find.jsp인 것을 알려주기 위해 hidden으로 보냄 --%>
<input type="submit" value="검색">
</form>
</body>
</html>










