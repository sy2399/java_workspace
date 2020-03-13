<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "customer.do">
아이디<input type = "text" name = "id"><br>
<input type = "hidden" name = "command" value = "findCustomerByID">
<input type = "submit" value = "검색"> 
</form>
<hr>
<form method = "post" action = "customer.do">
	아이디 <input type = "text" name = "id"><br>
	이름 <input type = "text" name = "name"><br>
	주소 <input type = "text" name = "address"><br>
	<input type = "hidden" name = "command" value = "register">
	<input type = "submit" value = "등록">
</form>
<hr>
<a href = "customer.do?command=getAllCustomerList">전체 고객 명단</a>
<!-- 
	views/list.jsp에서
	테이블로 명단을 제공한다.(jstl)
 -->
 
 <hr>
 <a href = "guestbook.do?command=getAllGuestBookList">방명록 목록보기</a>
 <!-- 
 	views/guestbook_list.jsp에서 방명록 리스트를 제공
 	
 	GuestBookController - GuestBookDAO -- guestbook.xml(기존것을 사용)
 						  GuestBookVO
 	
 	
  -->
</body>
</html>