<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSON Array</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr=new XMLHttpRequest();	
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4 && xhr.status ==200){
				//alert(xhr.responseText);
				var carList = JSON.parse(xhr.responseText);
				for(var i = 0;i<carList.length;i++){
					alert(carList[i].model + " " + carList[i].price)
				}
				
				
			}//if
		}//callback
		xhr.open("get","JSONArrayServlet2");
		xhr.send(null);
	}//starAjax
</script>
</head>
<body>
	<input type = "button" value = "JSONArray Test" onclick="startAjax()">
</body>
</html>