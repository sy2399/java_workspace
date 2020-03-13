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
		xhr = new XMLHttpRequest();
		var dept = document.getElementById("dept");
		
		//alert(dept.value)
		xhr.onreadystatechange = callback;
		xhr.open("post","DeptServlet");
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");//요청시 인코딩처리
		xhr.send("deptNo="+dept.value);
	}
	function callback(){
		if(xhr.status==200&&xhr.readyState==4){
			//아래 span영역에 응답하는 데이터를 출력
			document.getElementById("deptInfo").innerHTML  =  xhr.responseText;
		}
	}

</script>
</head>
<body>
<select id = "dept" onchange = "startAjax()">
	<option value = "">--부서번호--</option>
	<option value = "10">10</option>
	<option value = "20">20</option>
	<option value = "30">30</option>
</select>
<span id = "deptInfo"></span>
</body>
</html>