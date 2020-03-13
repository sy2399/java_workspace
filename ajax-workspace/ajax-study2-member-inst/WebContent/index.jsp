<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<h3>Model2 회원관리</h3><br>
<a href="findMemberById_AJAX.jsp">아이디로 회원검색</a><br>
<%--
		findMemberById.jsp -- DispatcherServlet--HandlerMapping--Controller
																				|
																				FindMemberByIdController
		forward 방식 
		findMemberById_ok.jsp
			findMemberById_fail.jsp																		
 --%>
<a href="findMemberByAddress.jsp">주소로 회원검색</a><br>
<%--
		findMemberByAddress.jsp -- DispatcherServlet--HandlerMapping--Controller
																				|
		forward방식															FindMemberByAddressController
		findMemberByAddress_ok.jsp
		목록제공 
			findMemberByAddress_fail.jsp 																		
 --%>
 <% MemberVO vo=(MemberVO)session.getAttribute("mvo");
	if(vo==null){
%>
<a href="login.jsp">로그인</a><br>
<a href="register.jsp">회원가입</a>
<br>
<a href="register_ajax.jsp">회원가입(ajax 아이디중복확인)</a>
<%}else{ %>
 <%=vo.getName() %>님 로그인 <br>
 <a href="DispatcherServlet?command=logout">로그아웃</a><br>
 <a href="cafe.jsp">카페가기</a><br>
 <a href="update.jsp">회원정보수정</a>
<%} %>
<hr>
<img src="model2-member.jpg">
</body>
</html>










