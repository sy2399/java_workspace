<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model2</title>
</head>
<body>
<h2>Model2 Architecture(MVC pattern)</h2>
<a href="find.jsp">검색서비스</a><br>
<a href="insert.jsp">정보등록서비스</a><br>
<%--forward--%>

<%--redirect --%>
<%--
			insert.jsp ---- DispatcherServlet --- MockDAO 
								|redirect방식 이동 
								| 
								insert_result.jsp 
 --%>
 <a href="findByAddress.jsp">주소로 검색</a><br>
 
 <%--
 			findByAddress.jsp --- DispatcherServlet -- MockDAO
 										|			
 									   findbyaddress_ok.jsp
 									   목록을 제공 
 									   or
 									   findbyaddress_fail.jsp
 									   판교에 사는 회원 없음 alert 후 
 									   index.jsp 이동 	
  --%>
  <a href="update.jsp">정보수정</a><br> 
  <img src = "frontController2.jpg">
</body>
</html>










