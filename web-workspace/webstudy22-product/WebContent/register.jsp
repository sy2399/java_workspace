<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>상품등록</h3>
	<form action="DispatcherServlet">
		상품명	<input type = "text" name = "name"><br>
		제조사	<input type = "text" name = "maker"><br>
		가격		<input type = "text" name = "price"><br>
		<input type = "hidden" name = "command" value = "register">
		<input type = "submit" value = "등록하기">
	</form>
</body>
</html>