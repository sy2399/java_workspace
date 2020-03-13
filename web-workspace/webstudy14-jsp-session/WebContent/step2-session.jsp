<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<%--
	session 에 MemberVO 정보가 있으면 아래와 같이 출력
	세션에 있는 회원정보
	아이디 : java 
	이름 : 김문일
	주소 : 개성
	세션에 MemberVo 정보가 없으면 아래와 같이 출력
	세션에 회원정보가 없습니다. alert후
	step1-session.jsp로 이동
 --%>
 <h3>세션에 있는 회원정보</h3>
 <%
	session = request.getSession(false);
 	if(session!=null){%>
 	아이디 <%=((MemberVO)session.getAttribute("memberVO")).getId()%><br>
 	이름 <%=((MemberVO)session.getAttribute("memberVO")).getName()%><br>
 	주소 <%=((MemberVO)session.getAttribute("memberVO")).getAddress()%><br>
 	<br> <a href = "step3-session.jsp">step3-session으로 이동</a>
 	<%} else{
 		%>
 		<script>
 		alert("세션에 회원 정보가 없습니다");
 		location.href = "step1-session.jsp";
 		</script>	
 	<%}	%>
</body>
</html>