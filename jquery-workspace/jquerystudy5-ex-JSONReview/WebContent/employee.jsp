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
<script src="//code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#empNo").change(function(){
			//alert($(this).val())
			if($(this).val() == ""){
				alert("사원번호를 선택하세요!");
				$("#empAndDeptInfo").empty();
				return;
			}
			
			//$.ajax({}) 함수를 좀 더 축약된 형태로 사용하는 getJSON 함수
			$.getJSON("DispatcherServlet","command=empAndDept&no="+$(this).val(),function(data){
				$("#empAndDeptInfo").html("<tr>"+
					"<td>"+data.ename+"</td>"+
					"<td>"+data.sal+"</td>"+
					"<td>"+data.dname+"</td>"+
					"<td>"+data.loc+"</td>"
					+"</tr>");
			});//getJSON 
		
		});//change
		
		//아래의 jquery는 event적용이 안된다
		//처음 페이지가 로드(document.ready) 되는 시점에
		//아래의 요소는 존재하지 않기 때문에
		// 이 경우엔, jQuery 의 on을 이용해 등록해야 한다
		/* $("#empAndDeptInfo td").click(function(){
			alert($(this).text();
		}); */
		$("#empAndDeptInfo").on("click","td", function(){
			alert($(this).text());
		});
	});//ready
</script>
</head>
<body>
	<%--jstl로 select option을 생성 --%>
	<select id = "empNo">
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