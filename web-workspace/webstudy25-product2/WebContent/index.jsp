<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Product</title>
</head>
<body>
	<h2>HOME</h2>
	<a href = "register.jsp">상품등록</a>
	<a href = "DispatcherServlet?command=getList">상품목록</a>
	<jsp:forward page="DispatcherServlet">
		<jsp:param value="getList" name="command"/>
	</jsp:forward>
</body>
</html>