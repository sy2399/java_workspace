<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step3-radio-action.jsp</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<% String s1 = request.getParameter("friend"); %>
	<%if(s1.equals("오연서")){ %>
		<img src="./picture/a.jpg">
	<%}else if(s1.equals("송중기")){ %>
		<img src="./picture/b.jpg">
	<%}else if(s1.equals("박보검")){ %>
		<img src="./picture/c.jpg">
	<%} %>
</body>
</html>