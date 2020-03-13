<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp LifeCycle</title>
</head>
<body>
<%--jsp의 LifeCycle은 Servlet의 LifeCycle과 유사 --%>
	<%!
		//메서드 오버라이딩
		public void jspInit(){
			System.out.println("jspInit");	
		}
		public void jspDestroyed(){
			System.out.println("jspDestroy");
		}
		
	%>
	<%System.out.println("jspService"); %>
	JSP LifeCycle Test
</body>
</html>