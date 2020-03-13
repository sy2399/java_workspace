<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajax 통신의 특징</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr = new XMLHttpRequest();
		//alert(xhr);
		//call back 함수 등록 : 서버가 응답하면 동작될 함수
		xhr.onreadystatechange = callback;
		xhr.open("get","ASynServlet");//get방식으로 ASynServlet에 요청
		xhr.send(null);//post방식일때 데이터 전송용으로 사용
		
	}
	function callback(){
		//200 : 정상수행, 4 : 응답완료
		if(xhr.status == 200 && xhr.readyState==4){
			//alert("call back 실행!")
			//alert(xhr.responseText)
			document.getElementById("ajaxView").innerHTML  =  xhr.responseText;
		}	
	}
</script>
</head>
<body>

<%--기존의 동기적 통신은 client 요청시 새로운 페이지로 응답한다 --%>

<form action = "SynServlet">
	<input type = "submit" value = "기존통신">
</form>

	<input type = "button" value = "ajax통신" onclick = "startAjax()">
	<span id = "ajaxView"></span>

</body>
</html>