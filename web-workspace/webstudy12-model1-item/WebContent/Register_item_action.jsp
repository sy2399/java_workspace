<%@page import="model.ItemVO"%>
<%@page import="model.ItemDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상품등록action</title>
<link rel = "stylesheet" type = "text/css" href = "mystyle.css">
</head>
<body>

<%
	  ItemDAO dao = ItemDAO.getInstance();
	  ItemVO vo = null;
	 
	  String name = request.getParameter("name");
	  String maker =request.getParameter("maker");
	  int price = Integer.parseInt(request.getParameter("price"));
	  
	  vo = new ItemVO(name,maker,price);
	  dao.registerItem(vo);
%>
<a href = "index.jsp">메인화면으로 가기</a><br>
<%=name %>등록완료
</body>
</html>