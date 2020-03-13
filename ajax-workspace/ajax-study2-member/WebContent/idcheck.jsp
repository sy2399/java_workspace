<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">

<title>아이디중복확인popup</title>
<script type="text/javascript">
	function closeWindow(result){
		var of=window.opener.document.registerForm;
		//alert(result);
		if(result==""){//사용불가일 경우 본 창의 아이디를 지운 후 포커스 준다
			of.id.value="";
			of.flag.value="";
			of.id.focus();			
		}else{// 사용가능할 경우 본 창의 패스워드에 포커스를 준다. 
			//of.flag.value=of.id.value;
			//또는 아래처럼 
			of.flag.value="<%=request.getAttribute("flag")%>";
			of.password.focus();
			
		}	
		//of.command.value = "register";
	}
</script>
</head>

<body bgcolor="<%=request.getAttribute("color") %>" onunload="closeWindow('<%=request.getAttribute("flag")%>')">	
	<%=request.getAttribute("mess") %><br><br>
	<input type="button" value="확인" onclick="javascript:self.close()">
</body>
</html>