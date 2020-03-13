<%@page import="model.ItemVO"%>
<%@page import="model.ItemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품등록페이지</title>
<script type="text/javascript">
function checkForm(){
	var mf=document.itemForm;
	if(isNaN(mf.price.value)){
		alert("가격을 숫자로 입력하세요!");
		return false;
	}
}
</script>
</head>
<body>
	<form method = "get" name = "itemForm" action = "register_item_action.jsp" onsubmit="return checkForm()" >
		
		상품명<input type = "text" name = "name" required = "required"><br>
		제조사<input type = "text" name = "maker" required = "required"><br>
		가격<input type = "text" name = "price" required = "required"><br>
		<input type = "submit" value = "등록">
	</form>
	
</body>
</html>