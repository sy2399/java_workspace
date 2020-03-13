<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>cafe.jsp</title>
</head>
<body>
	<%MemberVO vo = (MemberVO)session.getAttribute("memberVO");	%>
	<%if(vo!=null){%>
	<%=vo.getAddress()%>에 사는 <%=vo.getName() %>님 입장환영!
	 <a href = "logout.jsp">로그아웃</a>
	 <a href = "index.jsp">홈으로</a>
	 <%}else{ %>
	 	<script type="text/javascript">
	 		alert("로그인하세요!");
	 	</script>
	 <%} %>
</body>
</html>