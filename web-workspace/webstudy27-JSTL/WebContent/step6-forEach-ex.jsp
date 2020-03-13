<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%
	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	list.add(new MemberVO("java","1234","김호겸","야탑"));
	list.add(new MemberVO("spring","abcd","아이유","판교"));
	list.add(new MemberVO("jquery","dcba","김문일","야탑"));
	request.setAttribute("memberList", list);
	request.setAttribute("address", "야탑");
%>
<%--
	아래 body영역에서 table형식으로 표현하되
	request 영역에 있는 address 정보에  해당하는
	회원의 아이디 이름 주소를 출력
	1 java 김호겸 야탑
	2 jquery 김문일 야탑
 --%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>step6-forEach-ex.jsp</title>
<style type="text/css">
	table{
		border-collapse: collapse;
	}
	table,td{
		border: 1px solid black;
	}
	td{
		padding: 15px;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<td>index</td><td>아이디</td><td>이름</td><td>주소</td>
		</tr>
		
		
			<c:forEach items = "${requestScope.memberList }" var = "memList" varStatus="order">
				
					<c:choose>
						<c:when test="${memList.address==requestScope.address }" >
							
								<tr>
									<td>${order.count }</td>
									<td>${memList.id}</td>
									<td>${memList.name}</td>
									<td>${memList.address}</td>
								</tr>
						</c:when>
					</c:choose>
		
			</c:forEach>
			
		
	</table>

</body>
</html>