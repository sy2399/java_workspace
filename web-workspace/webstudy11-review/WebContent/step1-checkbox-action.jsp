<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
<% String menu[]=request.getParameterValues("menu");%>
<table border = "1" cellpadding="10">
	<thead>
	<tr>
		<th>NO</th><th>Menu</th>
	</tr>
	</thead>
	<tbody>
		<%for(int i = 0; i<menu.length;i++){ %>
		<tr>
			<td><%=i+1 %></td>
			<td><%=menu[i]%></td>
	
		</tr>
		<%} %>
	</tbody>
</table>
</body>
</html>