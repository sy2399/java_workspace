<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>springmvc3e</title>
</head>
<body>
SpringMVC3
<br>
<hr>
<form action="findCustomerById.do">
	고객아이디<input type = "text" name = "customerId">
	<input type = "submit" value = "검색">
</form>
<!-- 
	controller.FindCustomerByIdController
	views/find_ok or views/find_fail
  -->
</body>
</html>