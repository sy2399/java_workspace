<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step2-select-action.jsp</title>
</head>
<body>
<% int line = Integer.parseInt(request.getParameter("line"));%>
<%if(line<5){%>
	<h5>코레일 <%=line %> 호선을 선택하셨습니다</h5>
<%}else{%>
	<h5>도시철도 <%=line %>호선을 선택하셨습니다</h5>
<%} %>
</body>
</html>