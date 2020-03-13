<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function checkForm(){
	var sl=document.subwayForm.line;
	if(sl.value==""){
		alert("호선을 선택하세요!");
		return false;
	}
}	
</script>
</head>
<body>
	<form name = "sybwayForm" action = "step2-select-action.jsp"  onsubmit = "return checkForm()">
		<select name = "line">
		<option value="">--호선--</option>
		<%for(int i=1;i<10;i++){ %>
			<option value = "<%=i%>"><%=i %>호선</option>
			<%} %>
		</select>
		<input type = "submit" value = "선택">
	</form>
	<%--
	1. 	javascript로 호선을 선택하지 않았을 경우
		호선을 선택하세요 alert 전송
	2. 	step2-select-action.jsp에서는
		1~4 호선 까지는 
		코레일 4호선을 선택하셨습니다
		5~ 이후는 
		도시철도 6호선입니다	
	 --%>
</body>
</html>