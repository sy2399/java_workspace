<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>EL Param test</title>
</head>
<body>

1. 기존<%=request.getParameter("memberName") %>	<%--null이어도 null이출력됨 --%>
	<%=request.getParameter("age")+1 %><%--문자열로 인식 --> 211 --%>
<hr>
2. EL ${param.memberName}<%--null이면 아무것도 출력안함 --%>
	${param.age+1}<%--자동형변환 --%>

<hr>
<form action="step3.jsp">
	<input type = "checkbox" name = "food" value = "피자">피자<br>
	<input type = "checkbox" name = "food" value = "족발">족발<br>
	<input type = "checkbox" name = "food" value = "맥주">맥주<br>
	<input type = "submit" value = "주문">
</form>
</body>
</html>