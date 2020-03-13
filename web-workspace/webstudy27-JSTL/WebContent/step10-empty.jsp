<%@page import="model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	list.add(new MemberVO("java","1234","김호겸","야탑"));
	list.add(new MemberVO("spring","abcd","아이유","판교"));
	list.add(new MemberVO("jquery","dcba","김문일","야탑"));
	request.setAttribute("memberList", list);
	request.setAttribute("address", " 야탑 ");
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${empty requestScope.memberList }">
		리스트가 비어잇어
	</c:when>
	<c:otherwise>
		리스트 비어있지 않음
		회원수 : ${fn:length(memberList) }
	</c:otherwise>
</c:choose>
</body>
</html>