<%@page import="model.ItemVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.ItemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품목록 페이지</title>
<link rel = "stylesheet" type = "text/css" href = "mystyle.css">
</head>
<body>
<table>
	<tbody>
			<tr>
				<td>상품번호</td><td>이름</td>
			</tr>
	<%
	ItemDAO dao = ItemDAO.getInstance();
	int count = dao.getItemCount();
	ArrayList<ItemVO> list = dao.getItemList();
	for(int i = 0 ; i<count ; i++){%>
	
			<tr>
			<td><%=list.get(i).getItem_no()%></td>
			<td>
			<%
				int item_no = list.get(i).getItem_no();		
			%>
			<a href = "detail_item.jsp?item_no=<%=item_no%>"><%=list.get(i).getName()%></a>
			</td>
			</tr>
		
	<%} %>
	</tbody>
	</table>
	
	
</body>
</html>