<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC 4</title>
</head>
<body>
<a href = "test.action">설정테스트</a>

<hr>
<form action = "registerCar.action" method = "post">
<!-- post방식은 별도의 인코딩 처리가 필요하다.
기존에는 컨트롤러마다 처리가 필요했지만 Spring에선 web.xml에서 한번만 처리해도 모두 적용된다. -->
모델명 <input type = "text" name ="model"><br>
가격 <input type = "text" name = "price"><br>
<input type = "submit" value = "등록">
</form>
</body>
</html>