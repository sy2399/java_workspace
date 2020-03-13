<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	PersonVO pvo = new PersonVO();
	pvo.setName("김문일");
	pvo.setCar(new CarVO("아우디", 4000));
	request.setAttribute("person", pvo);
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>step8-set.jsp</title>
</head>
<body>
<%--EL로 접근시에는 getter를 호출 --%>
${requestScope.person.car.model }<br>
${requestScope.person.name }
<hr>
<c:set value = "${requestScope.person }" var = "p"/>
${p.name }
${p.car.model }
<hr>
<c:set value = "${requestScope.person.car }" var = "c"/>
${c.price }

<%--같은 페이지 내에서 반복해서 여러번 사용될 경우, EL의 c:set사용 --%>

</body>
</html>