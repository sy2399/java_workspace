<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>findMemberById.jsp</title>
</head>
<body>
	<h3>회원검색</h3>
	<form action = "findMemberById_action.jsp" name = "findMemberForm">
		아이디 <input type = "text" name = "id" required="required">
		<input type = "submit" value = "검색">
	</form>
</body>
</html>