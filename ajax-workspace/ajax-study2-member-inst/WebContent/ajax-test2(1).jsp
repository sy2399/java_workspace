<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajax-test2</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr=new XMLHttpRequest(); // javascript 통신 객체 
		var idComp=document.getElementById("memberId");
		if(idComp.value==""){
			alert("아이디를 입력하세요");
			return;
		}
		// 서버가 응답하면 실행할 익명함수를 등록(콜백함수)
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4&&xhr.status==200){//4:응답완료 ,200:정상수행
				//alert(xhr.responseText);//서버가 응답한 데이터를 출력 
				document.getElementById("checkResult").innerHTML=xhr.responseText;
			}//if
		}//callback
		//서버에 요청 
		xhr.open("get","DispatcherServlet?command=idCheckAjax&id="+idComp.value);
		xhr.send(null); // post방식일때 데이터 전송할 때 사용,
		// get방식일때는 null로 명시 
	}//startAjax
</script>
</head>
<body>
<input type="text" id="memberId">
<input type="button" value="확인" onclick="startAjax()">
<span id="checkResult"></span>
</body>
</html>









