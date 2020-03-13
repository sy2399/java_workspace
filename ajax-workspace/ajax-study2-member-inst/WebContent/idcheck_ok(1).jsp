<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디중복확인</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<script type="text/javascript">
	function closeWindow(){		
		var of=window.opener.document.registerForm; 
		// opener의 hidden 값을 변경 
		of.flag.value="<%=request.getParameter("id") %>";
		of.password.focus();				
	}
</script>
</head>
<body bgcolor="yellow" onunload="closeWindow()">
  <%=request.getParameter("id") %>는 사용가능!
 <br><br>
 <input type="button" onclick="javascript:self.close()" value="확인">
</body>
</html>




















