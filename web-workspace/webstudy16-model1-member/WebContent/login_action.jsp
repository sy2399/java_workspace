<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>login_action.jsp</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<% 	
	String id = request.getParameter("id");
 	String pw = request.getParameter("pw");

	MemberDAO dao = MemberDAO.getInstance();
 	MemberVO vo = dao.findMemberById(id);
 	boolean flag = false;
 	
 	if(vo!=null){
 		if(vo.getPassword().equals(pw)){%>
 			
 			<%session.setAttribute("memberVO",vo);
 				flag = true;
 			%>		
 			<%=vo.getName() %>님 로그인 ok<br>
 			<hr>
 			<a href = "cafe.jsp">카페가기</a>
 			<hr>
 			<a href = "index.jsp">홈으로</a>
 <%		}
 	}
 	
 	if(flag ==false){%>
 		<script>
 			alert("로그인 실패");
 			location.href = "index.jsp";
 		</script>	
 	<%}

 %>
</body>
</html>