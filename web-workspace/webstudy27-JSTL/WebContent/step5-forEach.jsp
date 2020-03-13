<%@page import="model.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8"> 
<title>step5-forEach.jsp</title>
</head>
<body>
<%
	String names[] = {"김문일", "김호겸", "정준영"};
	request.setAttribute("namesArray", names);
%>
JSTL 로 배열 요소를 출력<br>
<c:forEach items = "${requestScope.namesArray}" var="name">
	${name }
	<%--var안에 items를 넣는다 --%>
</c:forEach>
<hr>

<%
	ArrayList<PersonVO> perList = new ArrayList<PersonVO>();
	perList.add(new PersonVO("김문일",100));
	perList.add(new PersonVO("박보검",200));
	request.setAttribute("plist", perList);
%>
<%--
	jstl forEach 반복문
	items 속성 : 배열 또는 컬렉션
	var 속성 : 배열 또는 컬렉션 요소를 순차적으로 저장
	varStatus 속성 : index&count 속성이 있다
	begin 속성 : 몇번째 요소부터 반복문 실행할 지 명시
	end 속성 : 몇번째 요소까지 반복문 실행할 지 명시
 --%>
JSTL로 리스트의 요소의 name을 출력
<c:forEach items = "${requestScope.plist}" var="pName" varStatus="order">
	<br>	${order.count}${pName.name}${order.index}
	<%--index: 배열의 실제 인덱스값 --%>

</c:forEach>
<hr>
jstl forEach begin end 속성
<br>
<c:forEach begin = "1" end = "5" var = "num">
	${num }
</c:forEach>
<hr>

<%
	request.setAttribute("startPage", 5);
	request.setAttribute("endPage", 10);
%>

<c:forEach begin = "${requestScope.startPage }" end = "${requestScope.endPage }" var = "page">
	<c:choose>
		<c:when test="${page==8}">
			${page}
		</c:when>
	
		<c:otherwise>
			<a href="">${page }</a>
		</c:otherwise>
		</c:choose>
</c:forEach>
</body>
</html>