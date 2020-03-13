<%@page import="java.util.HashMap"%>
<%@page import="model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>login_action.jsp</title>
</head>
<body>
<%--전달받은 아이디와 패스워드가 ServletContext의 map정보에 있는
	회원정보 아이디, 패스워드와 일치하면
	<a>Home</a>
	송중기님 로그인 성공
	
	or 
	
	아이디가 없거나 아이디에 따른 패스워드가 일치하지 않으면 
	alert("로그인실패");
	location.href = "index.jsp"
 --%>
 <a href = "index.jsp">HOME</a><br>

 <% 
 	@SuppressWarnings("unchecked")
 	String id = request.getParameter("id");
 	String pw = request.getParameter("pw");
 	HashMap<String, MemberVO> map = (HashMap<String,MemberVO>)application.getAttribute("map");
 	//ServletContext의 attribute인 map 객체를 반환받는다
 	//ServletContext에 있는 HashMap의 정보를 가져옴
 
 	MemberVO vo = map.get(id);
 	boolean flag = false;
 	if(vo!=null){//id가 존재하면 id에 따른 pw를 비교
 		if(vo.getPassword().equals(pw)){//pw가 일치하면
 			flag = true;
 			session.setAttribute("memberVO",vo);%>
 			<%=vo.getName() %> 님 로그인 ok!	
 	<%	}
 	}%>
 	<%if(flag == false){ %>
 		<script type="text/javascript">
		alert("로그인 실패");
		location.href = "index.jsp";
		</script>	
 	
 	<%} %>
 
		

 
 
 
<%--  <%if(map.containsKey(id)&& map.get(id).getPassword().equals(pw)){%> 
 		form에서 보낸 id, pw정보가 ServletContext에 있는 정보와 일치하는지 check
 		
	 	<% session.setAttribute("memberVO",map.get(id));%>
	 	session에 memberVO setting해야 Home화면에서, 로그인된 상태인지 아닌지 check가능
	 	
	 	<%=map.get(id).getName() %> 님 로그인 ok!	

 <%}else{%>
 
 		<script type="text/javascript">
 		alert("로그인 실패");
 		location.href = "index.jsp";
 		</script>
 		
 <%}%> --%>
 
 
</body>
</html>