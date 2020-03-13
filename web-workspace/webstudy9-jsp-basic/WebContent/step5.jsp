<%@page import="model.PersonVO"%>
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
<% ArrayList<PersonVO> list = new ArrayList<PersonVO>();
	list.add(new PersonVO("김문일",22));
	list.add(new PersonVO("손연재",20));
	list.add(new PersonVO("박보검",24));
%>
<table border = "1" cellpadding="10">
	<thead>
	<tr>
		<th>이름</th><th>나이</th>
	</tr>
	</thead>
	<tbody>
		<%for(int i = 0; i<list.size();i++){ %>
		<tr>
			<td><%= list.get(i).getName()%></td>
		
			<td><%= list.get(i).getAge()%></td>
		</tr>
		<%} %>
	</tbody>
</table>
</body>
</html>