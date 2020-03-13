<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:forward page="DispatcherServlet">
	<jsp:param value="empNoList" name="command"/>
</jsp:forward>
<%--A
	index.jsp -- forward -- DispatcherServlet -- HandlerMapping -- EmpNumberListController
	
							employee.jsp
							jstl로 사원번호 select option 제공
							select option을 선택하면 ajax 방식으로 
							사원번호에 해당하는 
							사원명,월급,부서명,지역을 table 형식으로 제공
							EmpAndDeptController
						
 --%>
