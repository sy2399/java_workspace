<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>request getParameterValues() --> EL : paramValues</title>
</head>
<body>
	<%
	String fa[] = request.getParameterValues("food");
	%>
	<%=fa[0] %>  <%=fa[1] %>  <%=fa[2] %>
	<hr>
	${paramValues.food[0] }  ${paramValues.food[1] }  ${paramValues.food[2] }
	
</body>
</html>