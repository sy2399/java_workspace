<%@page import="model.MemberVO"%>
<%@page import="model.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>update_action.jsp</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<% 	
	String id = request.getParameter("id");
 	String pw = request.getParameter("pw");
 	String name = request.getParameter("name");
 	String address = request.getParameter("address");
 	
	MemberDAO dao = MemberDAO.getInstance();
 	MemberVO vo = new MemberVO(id,pw,name,address);
 	dao.updateMember(vo);
 	session.setAttribute("memberVO",vo);
 	
 %>
 수정정보<br>
 아이디	<%=vo.getId() %><br>
 패스워드<%=vo.getPassword()%><br>
 이름<%=vo.getName() %><br>
 주소<%=vo.getAddress() %><br>
 <a href = "index.jsp">Home</a>

</body>
</html>