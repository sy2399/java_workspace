<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입ajax</title>
<script type="text/javascript">
	var xhr;
	var checkFlag;//중복확인하여 사용가능여부를 true,false 로 저장 
	//회원가입전 인증여부를 확인한다
	function checkForm(){
		if(checkFlag==false){
			alert("아이디 중복확인 절차가 필요합니다!");
			return false;
		}
	}	
	function startAjax() {
		checkFlag=false;
		var mid=document.getElementById("memberId");
		var checkResultView=document.getElementById("checkResult");
		if(mid.value.length<4||mid.value.length>10){
			checkResultView.innerHTML
			="<font color=orange>아이디는 4자 이상 10자 이하이어야 함</font>";			
			return;
		}
		xhr=new XMLHttpRequest(); 
		xhr.onreadystatechange=function(){
			if(xhr.readyState==4&&xhr.status==200){//4:응답완료 ,200:정상수행
				checkResultView.innerHTML="";
				//alert(xhr.responseText=="true");		
				if(xhr.responseText=="true"){//아이디가 존재하면 사용불가 
					checkResultView.innerHTML="<font color=red>사용불가</font>";						
				}else{
					checkResultView.innerHTML="<font color=blue>사용가능</font>";		
					checkFlag=true;
				}
			}//if
		}//callback
		//서버에 요청 
		var idComp=document.getElementById("memberId");
		xhr.open("get","DispatcherServlet?command=memberIdCheckAjax&id="+idComp.value);
		xhr.send(null); // post방식일때 데이터 전송할 때 사용,
	}
</script>
</head>
<body>
	<a href="index.jsp">홈</a>
	<hr>
	<h3>회원가입</h3>
	<form method="post" name="registerForm" action="DispatcherServlet"
		onsubmit="return checkForm()">
		<input type="hidden" name="command" value="register"> 
		아이디 : <input type="text" name="id" id="memberId" required="required" onkeyup="startAjax()"> 
		<span id="checkResult"></span>
		<br>패스워드 : <input type="password" name="password" required="required"> 
		<br>이름 : <input type="text" name="name" required="required"> <br>
		주소 : <input type="text" name="address" required="required"> <br>
		<input type="submit" value="회원가입">
	</form>
	<%--		MemberIdCheckController 
				    아이디가 4자이상 10자 이하일때만 가입가능해야 하고
				    반드시 중복확인해서 아이디 사용가능일때만
				    회원가입이 되도록 한다 
				    
				    입력한 아이디가 4자 이상 10자 이하가 아닐때는
				    span checkResult 영역에 
				    아이디는 4자 이상 10자 이하이어야 합니다. 
				    4자 이상 10자 이하일 때는 
				    사용가능 
				    or
				    사용불가 
		
		 --%>
</body>
</html>







