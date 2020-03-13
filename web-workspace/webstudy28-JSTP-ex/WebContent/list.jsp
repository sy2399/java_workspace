<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>car list page</title>
<style type="text/css">
	table{
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
<h3>car List</h3>

<table>
	<tr>
			<td>index</td><td>model</td><td>price</td>
	</tr>	
	<c:forEach items = "${requestScope.listVO.carList }" var = "list" varStatus="order">
			
				<tr>
					<td>${order.count }</td>
					<td>${list.model}</td>
					<td>${list.price}</td>
				</tr>	
	</c:forEach>
	
</table>
	<c:forEach begin = "${requestScope.listVO.pagingBean.startPage }" end = "${requestScope.listVO.pagingBean.endPage  }" var = "page">
	
	<c:choose>
		<c:when test="${page==requestScope.listVO.pagingBean.nowPage}">
			${page}
		</c:when>
	
		<c:otherwise>
			<a href="">${page }</a>
		</c:otherwise>
		</c:choose>
</c:forEach>
</body>
</html>