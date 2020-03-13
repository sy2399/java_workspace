<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h2>Home</h2>
<a href = "findMemberById.jsp">아이디로 회원검색</a><br>
<%-- 
	findMemberById.jsp -- DispatcherServlet -- HandlerMapping -- Controller
																	| 
																	FindMemberByIdController
	forward방식
	findMemberById_ok.jsp
	findMemberById_fail.jsp
	
 --%>
<a href = "findMemberByAddress.jsp">주소로 회원검색</a><br>	
<%-- 
	findMemberByAddress.jsp -- DispatcherServlet -- HandlerMapping -- Controller
																	| 
																	FindMemberByAddresssController
	forward방식
	findMemberByAddress_ok.jsp -> 목록제공
	findMemberByAddress_fail.jsp -> "판교"에 사는 사람 없음 alert
																	
 --%>
 <a href = "findMemberByAddress.jsp">주소로 회원검색</a><br>	
 <%	MemberVO vo=(MemberVO)session.getAttribute("vo");
 
	if(vo==null){
%>
  <a href="login.jsp">로그인</a><br>
  <a href="register.jsp">회원가입</a>
 <%}else{ %>
 	<a href="update.jsp">회원정보수정</a><br>
 	<a href = "DispatcherServlet?command=logout">로그아웃</a><br>
 <%} %>
 <%--로그인 컨트롤러에서 세션 생성하기 --%>

</body>
</html>