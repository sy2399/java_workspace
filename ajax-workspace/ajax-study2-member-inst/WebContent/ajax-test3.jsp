<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>javascript keyup</title>
<script type="text/javascript">
	function testKeyup(){
		//alert("test");
		// view 영역에 입력한 아이디 정보가 출력되게 한다 
		var mid=document.getElementById("memberId").value;
		document.getElementById("view").innerHTML=mid;
	}
</script>
</head>
<body>
<input type="text" id="memberId" onkeyup="testKeyup()">
<span id="view"></span>
</body>
</html>








