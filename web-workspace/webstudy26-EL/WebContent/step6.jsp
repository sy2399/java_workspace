<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>web application path</title>
</head>
<body>
<%--동적으로 웹어플리케이션 경로명을 출력 --%>
${pageContext.request.contextPath }
</body>
</html>