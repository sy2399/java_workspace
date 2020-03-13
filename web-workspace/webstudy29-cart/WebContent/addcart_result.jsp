<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
	if(confirm("장바구니에 추가되었습니다!장바구니로 이동하시겠습니까?")){
		location.href = "cart.jsp";
	}else{
		location.href = "index.jsp";
	}
</script>
</body>
</html>