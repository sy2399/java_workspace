<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>springmvc MyBatis 통합</title>
</head>
<body>
<form action="findCustomerById.do">
	ID<input type = "text" name = "id">
	<input type = "submit" value = "검색">
</form>
<!-- 
	views/find_ok.jsp 에서 검색결과를 보여주고
	존재하지 않으면 
	views/find_fail.jsp에서 머머 아이디에 해당하는 
	고객정보 없습니다 
 -->
</body>
</html>