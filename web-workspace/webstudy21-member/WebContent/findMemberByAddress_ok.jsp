<%@page import="model.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%		
		String address = (String)request.getAttribute("address");
		ArrayList<MemberVO> list=(ArrayList<MemberVO>)request.getAttribute("vo");
				
		if(list.size()!=0){
	 %>
				<a href="index.jsp">홈</a><hr>
				<%=address %>에 사는 회원 <%=list.size() %>명 <br><br>
				<table>
					<% for(int i=0;i<list.size();i++){ %>
						<tr>
						    <td><%=list.get(i).getId()%></td>
							<td><%=list.get(i).getName()%></td>							
						</tr>
					<%} %>
				</table>
<%		} %>
</body>
</html>