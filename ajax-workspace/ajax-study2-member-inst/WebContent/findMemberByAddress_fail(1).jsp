<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList,model.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색결과</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
	<script type="text/javascript">
		alert("<%=request.getParameter("memberAddress")%>에 사는 회원이 없습니다!");
		location.href = "index.jsp";
	</script>
</body>
</html>






















