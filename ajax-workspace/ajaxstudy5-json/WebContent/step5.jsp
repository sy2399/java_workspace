<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSON</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr = new XMLHttpRequest();	
	
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4 && xhr.status ==200){
				//alert(xhr.responseText);
				var json = JSON.parse(xhr.responseText);
				document.getElementById("jsonView").innerHTML = json.deptNo + " " + json.dname +" " + json.location;
			}//if
		}//callback
		xhr.open("get","JSONTestServlet");
		xhr.send(null);
	}
</script>
</head>
<body>
<input type = "button" value = "JSON Test" onclick = "startAjax()">
<span id = "jsonView"></span>
</body>
</html>