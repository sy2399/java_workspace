<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>springmvc2</title>
</head>
<body>
Spring MVC2<br>
<hr>
<a href="my.kosta">MyController Test</a>
<!-- 
	1. spring 설정파일
	 >web.xml에서 설정한 dispatcherServlet설정파일명에 따라 spring Bean Configuration File 생성
	 
	2. 요청하면 controller.MyController 실행되게
	>1에서 만든 dispatcherServlet 설정파일에서 해당 컨트롤러 관련 설정 
	 및 해당 컨트롤러 코드에서 ModelAndView Return
	
	3. result.jsp가 응답
	>1에서 만든 dispatcherServlet 설정파일에서 ViewResolver관련 설정
 -->
 
 <form action="findMember.kosta">
 	ID<input type = "text" name = "memberId">
 	<input type = "submit" value = "검색">
 </form>
 
 <!-- 아이디 입력 후 검색을 누르면
 		/response/find_ok.jsp 에서 "java 임경수 구미" 출력
 		/response/find_fail.jsp 에서 "검색결과 없음" 출력
 		
 		FindMemberController에서는 MemberService 타입의 구현체를
 		DI로 확보한다(생성자 주입)
 		
 		이를 이용해 검색 성공 여부를 판단하여 응답하도록 처리
  -->
</html>