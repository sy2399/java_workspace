<%@page import="model.TestVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>EL get, is method</title>
</head>
<body>
<%--
	EL은 get method와 is method에 접근가능
 --%>
	<%
		TestVO vo = new TestVO();
		request.setAttribute("vo", vo);	
	%>
	1. name 출력 : ${requestScope.vo.name}<br>
	<%--findNick() 메서드는 EL 접근 불가,즉 get으로 시작되어야 함ㅁ- get메서드가 아니여서 --%>
	2. nickName 출력 : ${requestScope.vo.nickName} <%-- ${requestScope.vo.nick} --%><br>
	3. isBoolean : ${requestScope.vo.file }<br>
	4. money 출력 : ${requestScope.vo.money+200}<br>
	money==200 ? : ${requestScope.vo.money==200}
	money<200 ? :${requestScope.vo.money<200}
	money<200 & name=='김호겸'? :  ${requestScope.vo.money<200&&reqeustScope.vo.name=='김호겸'}
</body>
</html>