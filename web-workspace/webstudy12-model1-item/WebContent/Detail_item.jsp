<%@page import="model.ItemVO"%>
<%@page import="model.ItemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>detail_item</title>
<link rel = "stylesheet" type = "text/css" href = "mystyle.css">
</head>
<body>
<table>
	<% int no = Integer.parseInt(request.getParameter("item_no")); %>
	<% ItemDAO dao = ItemDAO.getInstance(); 
		ItemVO vo = dao.findItemByNo(no);
		int item_no = vo.getItem_no();
		String name = vo.getName();
		String maker = vo.getMaker();
		int price = vo.getPrice();
		
	%>
	
	
	<tr><td>상품번호</td><td><%=item_no %></td></tr>
	<tr><td>상품이름</td><td><%=name %></td></tr>
	<tr><td>제조사</td><td><%=maker%></td></tr>
	<tr><td>가격</td><td><%=price%></td>	</tr>

	</table>

</body>
</html>