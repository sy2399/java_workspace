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
	<jsp:include page="layout/header.jsp"></jsp:include>
	<jsp:include page="layout/left.jsp"></jsp:include>
	<div class = "main">
		<form action="DispatcherServlet">
		<input type = "hidden" name = "command" value = "registerItem">
			<table>
				<tr>
				<td>상품명</td><td><input type = "text" name = "name"></td>
				</tr>
				<tr>
				<td>제조사</td><td><input type = "text" name = "maker"></td>
				</tr>	
				<tr>
				<td>가격</td><td><input type = "text" name = "price"></td>
				</tr>	
				<tr>
				<td>상세정보</td><td>
				<textarea rows="4" cols="50" name="detail"></textarea>
				</tr>
				<tr><td colspan="2"><input type = "submit" value = "등록"></td></tr>	
		
			</table>
		</form>
	</div>
	<jsp:include page="layout/footer.jsp"></jsp:include>
</body>
</html>