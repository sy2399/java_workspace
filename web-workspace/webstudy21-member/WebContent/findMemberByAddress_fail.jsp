<%@page import="model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>검색실패</title>
</head>
<body>
	<% String address = (String)request.getAttribute("address");
		ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("vo");
		if(list.size()==0){
	%>
			<script type="text/javascript">
			alert("<%=address%>에 사는 회원없음");
			location.href="index.jsp";
			</script>	
	<%} %>			
</body>
</html>