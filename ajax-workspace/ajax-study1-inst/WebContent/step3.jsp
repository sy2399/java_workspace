<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajax</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr=new XMLHttpRequest();//ajax 통신 객체 생성 
		var deptComp=document.getElementById("dept");
		if(deptComp.value==""){
			alert("부서번호를 선택하세요");
			document.getElementById("deptInfo").innerHTML="";
			return;//함수 실행중단
		}
		xhr.onreadystatechange=callback;//응답시 실행할 함수등록
		xhr.open("post","DeptServlet");
		//ajax post 방식일 때 content type을 지정해야 한다. 
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		xhr.send("deptNo="+deptComp.value);
	}
	function callback(){
		if(xhr.status==200&&xhr.readyState==4){
			//아래 span 영역에 응답하는 데이터를 출력한다 
			document.getElementById("deptInfo").innerHTML=xhr.responseText;
		}
	}
</script>
</head>
<body>
<select id="dept" onchange="startAjax()">
	<option value="">--부서번호--</option>
	<option value="10">10</option>
	<option value="20">20</option>
	<option value="30">30</option>
</select>
<span id="deptInfo"></span>
</body>
</html>



