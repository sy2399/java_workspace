<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		session.invalidate();
%>
<script>
	alert("session invalidate ok~");
	location.href="step1-session.jsp";
</script>








