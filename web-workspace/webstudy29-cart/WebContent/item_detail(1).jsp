<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.MemberVO"%>
<%@page import="model.ItemVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
<link rel="stylesheet" type="text/css" href="css/home.css" />
<script>
	function cartOk(){
		if(confirm("쇼핑카트에 담으시겠습니까?"))
			location.href="DispatcherServlet?command=checkCart&itemNo=${requestScope.vo.item_no}";
	}

</script>
</head>
<body>
	<jsp:include page="layout/header.jsp"></jsp:include>
	<jsp:include page="layout/left.jsp"></jsp:include>
	<div class = "main">
		<table>
		<tr><td>상품번호</td><td>${requestScope.vo.item_no }</td></tr>
		<tr><td>상품명</td><td>${requestScope.vo.name }</td></tr>
		<tr><td>제조사</td><td>${requestScope.vo.maker}</td></tr>
		<tr><td>가격</td><td>${requestScope.vo.price}</td>	</tr>
		<tr><td>상세정보</td><td>${requestScope.vo.detail}</td>	</tr>
	<c:choose>
		<c:when test="${sessionScope.mvo!=null }">
			<tr>
			
			<td colspan="2">
			
			
			<input type = "hidden" name = "command" value = "checkCart">
			<input type = "button" value = "장바구니에 담기" onclick = "cartOk()">
			
			</td>
		</tr>
		</c:when>
	</c:choose>	
		

</table>
	</div>
	<jsp:include page="layout/footer.jsp"></jsp:include>
</body>
</html>