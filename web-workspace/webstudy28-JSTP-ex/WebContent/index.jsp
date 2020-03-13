<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>JSTL연습</title>
</head>
<body>
<jsp:forward page = "dispatcher">
	<jsp:param value="carList" name="command"/>
</jsp:forward>
</body>
</html>