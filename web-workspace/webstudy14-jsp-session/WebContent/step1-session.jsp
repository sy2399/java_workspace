<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp 내장객체 session</title>
</head>
<body>
<!-- 
	jsp가 java(Servlet) 로 웹컨테이너가
	생성할 때, 기본적으로
	request, session, ServletConfig, ServletContext
	객체를 생성하여 변수에 저장하므로 별도의 생성은 필요없다
 -->
<!-- 서블릿으로 변환되면서 자동으로 생성되기 때문에 선언하지 않아도 사용가능 -->
<%=request %><br>
<%=session %><br>
<%=config %><br>
<%=application %><br>
<%--세션에 정보를 할당해보기 --%>
<%
	session.setAttribute("memberVO", new MemberVO("java", "abcd", "김문일", "개성"));
	
%>
<hr>
step1-session.jsp에서 세션에 회원정보를 할당
<a href = "step2-session.jsp">step2에서 확인</a>
</body>
</html>