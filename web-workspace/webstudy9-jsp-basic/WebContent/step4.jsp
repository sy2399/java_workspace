<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp에서 VO객체 사용</title>
</head>
<body>
	<%PersonVO p = new PersonVO("김문일",20); %>
	<table border = "1" cellpadding="10">
		<thead>
			<tr>
				<th>이름</th><th>나이</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><%=p.getName()%></td>
				<td><%=p.getAge()%></td>
			</tr>
		</tbody>
	</table>
</body>
</html>