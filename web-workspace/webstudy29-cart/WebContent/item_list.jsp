<%@page import="model.ItemVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>item_list.jsp</title>
<link rel="stylesheet" type="text/css" href="css/home.css" />
</head>
<body>
<div class = "container">

	<jsp:include page="layout/header.jsp"></jsp:include>
	<jsp:include page="layout/left.jsp"></jsp:include>
	<div class ="main">
	<table>
	<tbody>
		<tr>
			<td>상품번호</td><td>이름</td><td>제조사</td>
		</tr>
	
		<c:forEach items="${requestScope.itemList}" var = "item">
			<tr>
				<td>${item.item_no}</td>
				<td><a href = "DispatcherServlet?command=findItemByNo&itemNO=${item.item_no }">${item.name}</a></td>
				<td>${item.maker}</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>

	</div>
	<jsp:include page="layout/footer.jsp"></jsp:include>
</div>
</body>
</html>