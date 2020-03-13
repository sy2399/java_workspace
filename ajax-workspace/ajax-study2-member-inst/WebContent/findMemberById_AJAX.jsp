<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<script type="text/javascript">
 var xhr;
 function startAjax(){  
  xhr=new XMLHttpRequest();//ajax 통신객체 
  // readyState 상태값 변화할 때 발생하는 이벤트에 대해 
  // 동작할 함수를 명시 (or 등록) : 익명함수형식으로 처리 
  xhr.onreadystatechange=function(){
   if(xhr.readyState==4&&xhr.status==200){
     //alert(xhr.responseText);   
	   document.getElementById("memberInfo").innerHTML=xhr.responseText;
   }
  }
  xhr.open("post","DispatcherServlet");
  xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
  xhr.send("command=findMemberByIdAjax&id="
		  +document.getElementById("memberId").value);
 }
</script>
</head>
<body>
<a href="index.jsp">홈</a><hr>
	<form name="findForm" method="get" action="DispatcherServlet">
		<input type="hidden" name="command" value="findMemberById"> 		
		아이디 : <input type="text" name="memberId" required="required"> 
		<input type="submit" value="검색">
	</form>
	<hr>
	아이디 <input type="text" id="memberId">
	<input type="button" value="Ajax검색" onclick="startAjax()">
	<span id="memberInfo"></span>
</body>
</html>
















