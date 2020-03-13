<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>find_ok</title>
</head>
<body bgcolor="yellow">
<%-- forward방식으로 이동했으므로 
		request 가 유지된다 
 --%>
검색 결과 <%=request.getAttribute("result") %>
</body>
</html>










