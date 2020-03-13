<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.ItemVO"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/home.css" />
</head>
<body>
<div class = "container">

	<jsp:include page="layout/header.jsp"></jsp:include>
	<jsp:include page="layout/left.jsp"></jsp:include>
	<div class ="main">
		
	
	
	
		<% HashMap<String,ItemVO> cart = (HashMap<String,ItemVO>)session.getAttribute("cart");
			if(cart!=null){
			Set<String> set=cart.keySet();
			Iterator<String> it=set.iterator();

		%>
		<table>
		<% int price =0; %>
			<%while(it.hasNext()){ %>
				<%String key = it.next();%>
				
				<tr>
					<td><%=cart.get(key).getItem_no()%></td>
					<td><%=cart.get(key).getName()%></td>
					<td><%=cart.get(key).getMaker()%></td>
					<td><%=cart.get(key).getPrice()%></td>
					<td><%=cart.get(key).getDetail()%></td>
					<td>
					<form action="DispatcherServlet">
					<input type = "hidden" name = "command" value = "deleteCart"> 
					<input type = "hidden" name = "itemNo" value = "<%=cart.get(key).getItem_no()%>"> 
					<input type = "submit" value = "삭제">
					</form>
					</td>
				</tr>
				<%price += cart.get(key).getPrice(); %>
				
				
			<%}
			%>
				<tr>
				<td colspan = "6">총액:<%=price %></td>
				</tr>
			<%}else{ %>
			<h2>장바구니 비어있음</h2>
			<% }%>
		</table>
		
		
		
		
		
	</div>
	<jsp:include page="layout/footer.jsp"></jsp:include>
</div>
</body>
</html>