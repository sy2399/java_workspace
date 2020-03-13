<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSON(javascript object notation)</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		var memberId=document.getElementById("memberId").value;
		var nameView=document.getElementById("nameView");
		var addressView=document.getElementById("addressView");
		//alert(memberId);
		if(memberId==""){
			nameView.innerHTML="";
			addressView.innerHTML="";
			return;
		}
		xhr=new XMLHttpRequest();		
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4){// 4 : 응답완료 
				   if(xhr.status==200){// 200 : 정상수행 
				    	//alert(xhr.responseText);
				  		
				  		var memberObj=JSON.parse(xhr.responseText);
				  		//alert(memberObj.name);
				  		document.getElementById("nameView").innerHTML=memberObj.name;
				  		document.getElementById("addressView").innerHTML=memberObj.address;
				  		
				   }
				 }
		};
		xhr.open("get","FindMemberByIdServlet?memberId="+memberId); 
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		xhr.send(null);
	}
	 
</script>
</head>
<body>
	<select id = "memberId" onchange = "startAjax()">
		<option value ="">---</option>
		<option value ="java">java</option>
		<option value ="spring">spring</option>
		<option value ="ajax">ajax</option>
	</select>
	
	<hr><br>
	회원이름&nbsp;&nbsp; <span id = "nameView"></span><br>
	주소&nbsp;&nbsp;<span id = "addressView"></span>
	<%--
		1. 선택한 아이디를 alert 출력
		     아이디 정보가 공란이면 return으로 실행 중단
		2. Ajax 통신을 위한 XMLHttpRequest 객체 생성
		3. callback 익명함수 정의
		4. open("get","FindMemberByIdServlet")
		5. send(null);
	 --%>
</body>
</html>