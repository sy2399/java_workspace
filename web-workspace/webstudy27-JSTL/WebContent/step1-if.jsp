<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>step1-if</title>
</head>
<body>
<c:if test="true">
	true이므로 실행된다
</c:if>
<c:if test="false">
	false이므로 실행안된다
</c:if>
<a href = "step1-if.jsp?nick=정준영&age=24">현재 페이지를 다시 호출</a><br>
<c:if test="${param.nick=='정준영'&& param.age<30}">
	${param.nick} 야탑 청년 ${param.age }세
</c:if>
</body>
</html>