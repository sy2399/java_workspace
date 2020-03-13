<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>step2-select-onchanege.jsp</title>
<script type="text/javascript">
	function sendData(){
	
		if(document.subwayForm.line.value!=""){
			if(confirm(document.subwayForm.line.value + "호선을 전송하시겠습니까?"))
			document.subwayForm.submit();
		} 
		 
		
	}
</script>
</head>
<body>
	<form name="subwayForm" action = "step2-select-action.jsp">
		<select name="line" onchange = "sendData()">
		<option value="">--호선--</option>
		<%for(int i=1;i<10;i++){ %>
			<option value = "<%=i%>"><%=i %>호선</option>
			<%} %>
		</select>
	</form>
</body>
</html>