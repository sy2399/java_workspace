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
		of.id.value="";
		of.flag.value="";
		of.id.focus();			
	}
</script>
</head>
<body bgcolor="orange" onunload="closeWindow()">
  <%=request.getParameter("id") %>는 중복! 사용불가
 <br><br>
 <input type="button" onclick="javascript:self.close()" value="확인">
</body>
</html>




















