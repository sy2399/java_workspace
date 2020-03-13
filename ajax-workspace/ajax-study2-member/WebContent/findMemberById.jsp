<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>findMemberById.jsp</title>
<script type="text/javascript">
	var xhr;
	function startAjax() {
		var memberId = document.getElementById("memberId");
		xhr = new XMLHttpRequest();//ajax 통신객체 
		// readyState 상태값 변화할 때 발생하는 이벤트에 대해 
		// 동작할 함수를 명시 (or 등록) : 익명함수형식으로 처리 
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				document.getElementById("memberInfo").innerHTML  =  xhr.responseText;
				
			}
		}
		xhr.open("post", "DispatcherServlet");
		//ajax post 방식일 때 content type을 지정해야 한다. 
		xhr.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");
		xhr.send("command=findMemberByIdAjax&"+"id="+memberId.value);
	}
</script>
</head>
<body>
	<h3>아이디로 회원검색</h3>
	<form action="DispatcherServlet">
		아이디 <input type="text" name="id"> <input type="hidden"
			name="command" value="findById"> <input type="submit"
			value="아이디로 회원검색">
	</form>
	<hr>
	아이디
	<input type="text" id="memberId">
	<input type="button" value="Ajax회원검색" onclick="startAjax()">
	<span id="memberInfo"></span>

</body>
</html>