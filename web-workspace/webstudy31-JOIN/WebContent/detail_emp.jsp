<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>detail_emp.jsp</title>
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/css/board.css">
</head>
<body>
<table class="content">
		<tr>
			<td>사원번호</td>
			<td>${requestScope.evo.empno }</td>
		</tr>
		<tr>
			<td>사원명</td>
			<td>${requestScope.evo.ename }</td>
		</tr>
		<tr>
			<td>월급</td>
			<td>${requestScope.evo.sal}</td>
		</tr>
		<tr>
			<td>부서번호</td>
			<td>${requestScope.evo.deptVO.deptno }</td>
		</tr>
		<tr>
			<td>부서명</td>
			<td>${requestScope.evo.deptVO.dname }</td>
		</tr>
		<tr>
			<td>지역</td>
			<td>${requestScope.evo.deptVO.loc }</td>
		</tr>
		<tr>
			<td>TEL</td>
			<td>${requestScope.evo.deptVO.tel }</td>
		</tr>
	</table>
</body>
</html>