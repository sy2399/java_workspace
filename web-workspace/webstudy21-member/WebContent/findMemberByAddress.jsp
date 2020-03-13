<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>주소로 회원검색</title>
</head>
<body>
<h3>주소로 회원검색</h3>
<form action="DispatcherServlet">
	주소 <input type = "text" name = "address">
	<input type = "hidden" name = "command" value = "findByAddress">
	<input type = "submit" value = "주소로 회원검색">
</form>
</body>
</html>