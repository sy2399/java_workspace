<%@page import="model.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>step2-choose when otherwise(if~else if ~else 역할)</title>
</head>
<body>
<%
	PersonVO vo = new PersonVO("김호견", 1000);
	request.setAttribute("pvo", vo);
%>

EL로 name 과 money를 출력<br>
${requestScope.pvo.name}
${requestScope.pvo.money }
<hr>
<c:choose>
	<c:when test="${pvo.name=='간디' }">
	간디
	</c:when>
	<c:when test="${pvo.name=='김호겸' }">
	김호겸
	</c:when>
	<c:otherwise>
	else의 역할
	</c:otherwise>
</c:choose>

</body>
</html>