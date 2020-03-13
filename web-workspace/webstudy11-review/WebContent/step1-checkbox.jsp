<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step1-checkbox</title>
<script type="text/javascript">
function checkOrder(){
	var m=document.menuForm.menu;
	var flag = false;
	for(var i=0;i<m.length;i++){
		if(m[i].checked){
			flag = true;
			break;
		}
	}
	if(flag==false){
		alert("메뉴를 선택하세요");
	}
}
</script>
</head>
<body>
<form method = "post" name = "menuForm" action = "step1-checkbox-action.jsp" onsubmit = "return checkOrder()">
<input type = "checkbox" name = "menu" value = "버거킹">버거킹<br>
<input type = "checkbox" name = "menu" value = "꽃등심">꽃등심<br>
<input type = "checkbox" name = "menu" value = "떡볶이">떡볶이<br>
<input type = "submit" value = "주문">
</form>
<%--
	선택 여부를 자바스크립트로 확인
	jsp 에서 응답시 테이블로 보여줌
	NO	Menu
	1   버거킹
	2   꽃등심
	
 --%>
</body>
</html>