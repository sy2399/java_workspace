<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajax-test</title>
<script type="text/javascript">
	var xhr;
	function startAjax() {
		xhr = new XMLHttpRequest();//ajax 통신객체 
		// readyState 상태값 변화할 때 발생하는 이벤트에 대해 
		// 동작할 함수를 명시 (or 등록) : 익명함수형식으로 처리 
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				document.getElementById("count").innerHTML  =  xhr.responseText;
				
			}
		}
		xhr.open("post", "DispatcherServlet");
		//ajax post 방식일 때 content type을 지정해야 한다. 
		xhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");
		xhr.send("command=memberCount");
	}
</script>
</head>
<body>
<input type = "button" value="총회원수보기" onclick="startAjax()">
<span id = "count"></span>명
<%--
	command=memberCount - C : MemberCountController
	
 --%>
</body>
</html>