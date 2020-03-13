<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSONarray</title>
<script type="text/javascript">
	var xhr;
	function startAjax(){
		xhr = new XMLHttpRequest();	
		var addrComp = document.addressForm.address;
		var memberInfo = document.getElementById("memberInfo");

		alert(addrComp.value);
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4 && xhr.status ==200){
				//alert(xhr.responseText);
				var list = JSON.parse(xhr.responseText);
				var innerHTML="";
				//alert(list);
				for(var i = 0;i<list.length;i++){
					
					innerHTML+="<tr>";
					innerHTML+="<td>"+list[i].id+"</td>";
					innerHTML+="<td>"+list[i].name+"</td>";
					innerHTML+="</tr>";
				}
				memberInfo.innerHTML=innerHTML;
				
			}//if
		}//callback
		xhr.open("get","FindMemberListServlet?addrCompParam="+addrComp.value);
		xhr.send(null);
	}
</script>
<style type="text/css">
	table{
		border-collapse: collapse;
	}
	table,td,th{
		border: 1px solid black;
	}
	th,td{
		padding:15px;
	}
</style>
</head>
<body>
	<form name = "addressForm">
	<input type = "radio" name = "address" value = "판교" onchange="startAjax()">판교<br>
	<input type = "radio" name = "address" value = "종로" onchange="startAjax()">종로<br>
	</form>
	<br><br>
	<table>
		<thead>
			<tr>
				<th>아이디</th><th>이름</th>
			</tr>
		</thead>
		<tbody id = "memberInfo">
		
		</tbody>
	</table>
</body>
</html>