<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>findMemberById_action.jsp</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		MemberDAO dao = MemberDAO.getInstance();
		MemberVO vo = null;
		if(id!=null){
		 vo = dao.findMemberById(id);}
		if(vo!=null){%>
			아이디 &nbsp; <%=vo.getId()%><br>
			이름  &nbsp;<%=vo.getName() %><br>
			주소 &nbsp;<%=vo.getAddress() %><br>
			
		<% }else{%>
			<script>
			alert("<%=id%>에 해당하는 회원이 존재하지 않습니다");
			location.href = "index.jsp";
			</script>
		<% }%>
</body>
</html>