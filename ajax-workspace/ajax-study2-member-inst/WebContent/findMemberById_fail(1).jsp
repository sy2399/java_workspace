<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>검색결과없음</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
 <script type="text/javascript">
	alert("<%=request.getParameter("memberId")%>에 해당하는 회원없음!");
	location.href="index.jsp";
</script>
</body>
</html>











