<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSONArray</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr=new XMLHttpRequest();	
		
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4 && xhr.status ==200){
				//alert(xhr.responseText);
				var arr = JSON.parse(xhr.responseText);
				var data = "";
				for(var i=0;i<arr.length;i++){
					data += i+"."+arr[i]+"";
				}
				document.getElementById("result").innerHTML=data;
			}//if
		}//callback
		xhr.open("get","JSONArrayServlet");
		xhr.send(null);
	}//starAjax
</script>
</head>
<body>
<input type = "button" value="JSONArrayTest" onclick="startAjax()">
<br>
<span id = "result"></span>
</body>
</html>