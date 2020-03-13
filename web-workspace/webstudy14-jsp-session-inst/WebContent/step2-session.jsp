<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 내장객체 session</title>
</head>
<body>
<%-- 세션에 MemberVO 정보가 있으면 아래와 같이 출력 		
		세션에 있는 회원정보 
		아이디:java  이름:김문일 주소:개성
		세션에 MemberVO 정보가 없으면 아래와 같이 출력
		세션에 회원정보가 없습니다. alert 후 
		step1-session.jsp로 이동시킨다 	
 --%>
<%
	MemberVO vo=(MemberVO)session.getAttribute("memberVO");
	if(vo!=null){
%>      아이디:<%=vo.getId()%>  
         이름:<%=vo.getName()%> 
         주소:<%=vo.getAddress() %>
         <br><a href="step3-session.jsp">step3-session으로 이동</a>
<% }else{ %>
		 <script type="text/javascript">
		 	alert("세션에 회원정보가 없습니다");
		 	location.href="step1-session.jsp";
		 </script>	
<% } %>
</body>
</html>


















