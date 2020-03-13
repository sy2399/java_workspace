<%@page import="java.util.ArrayList"%>
<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>findMemberByAddress_action.jsp</title>
<style type="text/css">
	table {
		border-collapse: collapse;
     }
     table,td{
     	border: 1px solid black;
     }
     td{
     	padding: 15px;
     }
</style>
</head>
<body>
<%
		String address = request.getParameter("address");
		MemberDAO dao = MemberDAO.getInstance();
		ArrayList<MemberVO> voList = null;
		if(address!=null){
		 voList = dao.findMemberByAddress(address);
		 }
		if(voList.size()!=0){		%>
		<%=address %>에 사는 사람<%=voList.size() %>명<br><br>
			<table>
				<tr>
					<td>아이디</td>
					<td>이름</td>
				</tr>
				<%for(int i = 0; i<voList.size();i++){ %>
					<tr>
						<td><%=voList.get(i).getId() %></td>
						<td><%=voList.get(i).getName() %></td>
					</tr>
				<% } %>
			</table>
		<% }else{%>
			<script>
				alert("<%=address%>에 해당하는 회원이 존재하지 않습니다");
				location.href = "index.jsp";
			</script>
		<% }%>
</body>
</html>