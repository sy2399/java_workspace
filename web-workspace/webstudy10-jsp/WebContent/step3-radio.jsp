<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step3-radio.jsp</title>
<script>
function checkForm(){
	var df = document.friendForm.friend;
	if(df.value ==""){
		alert("선택해주세요");
		return false;
	}
}
</script>
</head>
<body>
	<form method = "post" action="step3-radio-action.jsp" name = "friendForm" onsubmit = "return checkForm()">
		<input type = "radio" name="friend" value="오연서">오연서<br>
		<input type = "radio" name="friend" value="송중기">송중기<br>
		<input type = "radio" name="friend" value="박보검">박보검<br>
		<input type = "submit" value = "선택">
	</form>
</body>
</html>