<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.ItemVO"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
 
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
		
	<c:choose>
		<c:when test="${sessionScope.cart!=null}">
		<table>
			<c:set value= "0"  var = "price" ></c:set>
			<c:forEach var="cartMap" items="${sessionScope.cart}" varStatus="status"> 
			
			<tr> 
			<td>${cartMap.key}</td> 
			<td>${cartMap.value.name}</td> 
			<td>${cartMap.value.maker}</td> 
			<td>${cartMap.value.price}</td> 
			<td>${cartMap.value.detail}</td> 
			<td>
					<form action="DispatcherServlet">
					<input type = "hidden" name = "command" value = "deleteCart"> 
					<input type = "hidden" name = "itemNo" value = "${cartMap.key}"> 
					<input type = "submit" value = "삭제">
					</form>
			</td>
			</tr> 
			
			<c:set value= "${price+cartMap.value.price }"  var = "price" ></c:set>
			<tr>
				<td colspan="6">${price }</td>
			</tr>
			</c:forEach>
			
		</table>
		</c:when>
		<c:otherwise>
			장바구니 비어있음
		</c:otherwise>
	</c:choose>

	</div>
	<jsp:include page="layout/footer.jsp"></jsp:include>
</div>
</body>
</html>