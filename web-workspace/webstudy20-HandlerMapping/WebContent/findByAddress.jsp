<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>findByAddress form</title>
</head>
<body>
<%--
	DispatcherServlet -- Controller
							 |
						FindByAddressController 
 --%>
<form action="DispatcherServlet">
<%-- forward 방식 --%>
주소 <input type="text" name="address">
<input type = "hidden" name = "command" value = "findByAddress">
<input type="submit" value="검색">
</form>
</body>
</html>