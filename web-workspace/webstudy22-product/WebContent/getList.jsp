<%@page import="model.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>
<h3>상품목록</h3>
<hr>
<a href = "index.jsp">HOME</a>
<a href = "register.jsp">상품등록</a>
<hr>
<table>
	<tbody>
			<tr>
				<td>상품번호</td><td>이름</td><td>등록일시</td>
			</tr>
<%
	ArrayList<ProductVO> list = (ArrayList<ProductVO>)request.getAttribute("list");
	
	if(list.isEmpty() == false){%>
	<%for(int i = 0 ; i<list.size();i++) {%>
		<tr>
			<td><%=list.get(i).getProductNo() %></td>
			<td>
			<%
				String productNo = list.get(i).getProductNo();
			%>
			<a href = "DispatcherServlet?command=detailProduct&productNo=<%=productNo%>"><%=list.get(i).getName() %></a>
			</td>
			<td><%=list.get(i).getProduct_date() %></td>
		</tr>
	<%} %>
	</tbody>
</table>		
	<%}else{%>
		상품없음!
	<%} %>
	
</body>
</html>