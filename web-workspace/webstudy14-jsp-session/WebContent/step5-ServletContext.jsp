<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>step5-ServletContext.jsp</title>
</head>
<body>
	JSP에서는 ServletContext객체를 반환받아 <br>
	application 변수명에 할당한다<br>
	-> jsp내장객체<br>
	
	<hr>
	
	<%=application.getContextPath()	%>
	<%--/webstudy14-session-servlet : 웹어플리케이션 경로 --%>
	<hr>
	<br>
	서블릿컨텍스트 초기 파라미터 관리자 이메일을 출력해보기<br>
	<%=application.getInitParameter("adminEmail") %><br>
	서블릿컨텍스트에 저장된 정보를 반환<br>
	<%=application.getAttribute("memberInfo") %>
</body>
</html>