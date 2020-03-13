<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  session="false"%>
<%--
		위처럼 지시자 태그 영역에 session=false를 
		명시하면 웹컨테이너에게 session 선언 및 생성
		부분을 제외시킨다. 즉 개발자가 직접 session
		제어를 하겠다는 의미 
 --%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp session option</title>
</head>
<body>
session="false" 를 테스트한다 
<%-- <%=session %> --%>
<%-- 아래와 같이 직접 제어할 수 있다 --%>
<hr>
<%		HttpSession session=request.getSession(false);
		if(session==null){
%>				세션 없음 
<%		}else{ %>
				기존 세션 있음
<%		} %>
</body>
</html>







