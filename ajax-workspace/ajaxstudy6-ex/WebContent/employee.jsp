<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>employee.jsp</title>
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
<script type="text/javascript">
	var xhr;
	
	function startAjax(){
		var empNo = document.getElementById("empNo").value;
		var empAndDeptInfo = document.getElementById("empAndDeptInfo");
		if(empNo ==""){
			return;
		}
		xhr=new XMLHttpRequest();		
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4 && xhr.status==200){
				var map = JSON.parse(xhr.responseText);
				//alert(xhr.responseText);
				
				var innerHTML = "";
				
				innerHTML+="<tr>";
				innerHTML+="<td>"+map.ename+"</td>";
				innerHTML+="<td>"+map.sal+"</td>";
				innerHTML+="<td>"+map.dname+"</td>";
				innerHTML+="<td>"+map.loc+"</td>";
				innerHTML+="</tr>";
				
				empAndDeptInfo.innerHTML = innerHTML;
			}//if
		}//callback
		xhr.open("get","DispatcherServlet?command=empAndDept&no="+empNo); 
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		xhr.send(null);
	}//startAjax
</script>
</head>
<body>
	<%--jstl로 select option을 생성 --%>
	<select id = "empNo" onchange="startAjax()">
		<option value = "">-사원번호-</option>
		
		<c:forEach var = "list" items="${requestScope.noList }">
			<option value = "${list }" >${list }</option>
		</c:forEach> 
	</select>
	<br><br><br>
	<table>
		<thead>
			<tr>
				<th>사원명</th><th>월급</th><th>부서명</th><th>지역</th>
			</tr>
		</thead>
		<tbody id = "empAndDeptInfo"></tbody>
	</table>
</body>
</html>