<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp 기본문법</title>
</head>
<body>
	<!-- 이 부분은 html 주석 -> client에게 보여짐 > F12 소스보기에서 보임 -->
	<%-- 이 부분은 jsp 주석 --%>
	<h3>jsp 기본문법 테스트</h3>
	<%
		for(int i = 1; i<101;i++){
			out.println("<font color = 'blue' size = '5'>"+ i +"</font>");
		}

	%>
	<hr>
	
	<%--아래와 같은 형식의 코딩을 권장 --%>
	<%--expression 태그를 이용해 표현 --%>
	<%	
	//자바 코드 영역 (scriptlet)
	/*
	for문을 이용해 1부터 100까지 화면에 출력
	*/
	for(int i = 1;i<101;i++){%>
	<font color = "green" size = "5"><%=i%></font>	
	<%}%>
	
	<hr>
	변수 test
	<%int age =22; %>	<%--local variable >>초기화를 명시적으로 해줘야해--%>
	<%! int money; %> <%--instance variable >>기본으로 초기화됨 --%>
	money: <%=money%>
	age : <%=age %>
</body>
</html>