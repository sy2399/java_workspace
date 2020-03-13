<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "javax.sql.*, model.*,java.sql.*"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>dbcp test</title>
</head>
<body>
	Database Connection Pool로 부터 connection을 빌려온다
	<%
		DataSource dataSource = DataSourceManager.getInstance().getDataSource();
		Connection con = dataSource.getConnection();
	%>
	<%=con %> 
	<hr>
	connection 클래스명: <%=con.getClass() %>
	
	<%
		con.close();//소멸이 아니라 dbcp로 반납
	%>
	<hr>
	참고 - 기존 connection class명 : 
	<%	//기존방법으로 connection을 새로 생성
		Connection con2 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "scott", "tiger");
	%>
	<%=con2.getClass() %>
	<hr>
	<%
		con2.close();//con2를 소멸
	%>
	<hr>
	<%
		ArrayList<CarVO> list = CarDAO.getInstance().getAllList();
		for(CarVO vo:list){
	%>
		<%=vo.getCar_no() %>
		<%=vo.getModel() %>
		<%=vo.getPrice() %>
	<%} %>
	
</body>
</html>