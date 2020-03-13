<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.ArrayList,model.MemberVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색결과</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<a href="index.jsp">홈</a><hr>
<% 
    String address=request.getParameter("memberAddress");	
 	@SuppressWarnings("unchecked")
	ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("list");
%>		<%=address %>에 사는 회원 목록
		<br><br>
		<table>
		<% for(int i=0;i<list.size();i++){ %>
			<tr>
				<td><%=list.get(i).getId() %></td>
				<td><%=list.get(i).getName() %></td>
			</tr>
		<%} %>
		</table>
</body>
</html>






















