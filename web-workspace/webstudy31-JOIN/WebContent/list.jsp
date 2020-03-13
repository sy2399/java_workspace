<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/css/board.css">
</head>
<body>
<table class="list">
		<caption>목록</caption>
		<thead>

			<tr>
				<th class="no">사원번호</th>
				<th class="title">사원명</th>
				<th class="name">부서명</th>
				<th class="date">지역</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="evo" items="${requestScope.empList}">
				<tr>
					<td><a
						href="${pageContext.request.contextPath}/DispatcherServlet?command=detail&empno=${evo.empno }">${evo.empno }</a></td>
					<td>${evo.ename}</td>
					<td>${evo.deptVO.dname }</td>
					<td>${evo.deptVO.loc}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>