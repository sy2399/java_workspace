<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>AJAX</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr = new XMLHttpRequest();
		var idComp = document.getElementById("memberId");
		if(idComp.value ==""){
			alert("아이디를 입력하세요");
			idComp.focus();
			return;//함수 실행중단
		}
		xhr.onreadystatechange = callback;//응답시 실행할 함수 등록
		xhr.open("post","AjaxMemberServlet");
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");//요청시 인코딩처리
		xhr.send("id="+idComp.value);
	
	}
	function callback(){
		if(xhr.status==200&&xhr.readyState==4){
			//아래 span영역에 응답하는 데이터를 출력
			document.getElementById("resultView").innerHTML  =  xhr.responseText;
		}
	}
</script>
</head>
<body>
<input type = "text" id="memberId">
<input type = "button" value="검색" onclick = "startAjax()">
<span id = "resultView"></span>
</body>
</html>