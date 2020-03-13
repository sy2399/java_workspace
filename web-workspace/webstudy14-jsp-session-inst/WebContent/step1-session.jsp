<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step1-session.jsp</title>
</head>
<body>
<%--    jsp 가 java(Servlet) 로 웹컨테이너가
		  생성할 때 기본적으로 
		  request, session , ServletConfig ,ServletContext
		  객체를 생성하여 변수에 저장하므로 
		  별도의 생성은 필요없다 
 --%>
<%=request %> <br>
<%=session %> <br>
<%=config %><br>
<%=application %><br>
<%-- 세션에 정보를 할당 --%>
<%
		session.setAttribute("memberVO", 
				new MemberVO("java","abcd","김문일","개성"));
%>
<hr> step1-session.jsp에서 세션에 회원정보를 할당 <br>
<a href="step2-session.jsp">step2에서 확인</a>
</body>
</html>








