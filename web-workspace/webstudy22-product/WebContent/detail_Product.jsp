<%@page import="model.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>상세정보</title>
<%
	ProductVO vo= (ProductVO)request.getAttribute("vo");
	String no = vo.getProductNo();
%>
<script type="text/javascript">
	function deleteProduct(){
		if (!confirm("정말 삭제하시겠습니까??")){    //확인
		    return false;
		}else{   //취소
			location.href = "DispatcherServlet?command=deleteProduct&no=<%=no%>";
		}
	}
</script>
</head>
<body>
<h3>상세정보</h3>
<hr>
<a href = "index.jsp">HOME</a>
<a href = "DispatcherServlet?command=getList">상품목록</a>
<hr>


<table>
	<tr><td>상품번호</td><td><%=vo.getProductNo() %></td></tr>
	<tr><td>상품명</td><td><%=vo.getName() %></td></tr>
	<tr><td>제조사</td><td><%=vo.getMaker() %></td></tr>
	<tr><td>가격</td><td><%=vo.getPrice() %></td>	</tr>
	<tr><td>등록일시</td><td><%=vo.getProduct_date() %></td>	</tr>
	
	<tr><td><input type = "button" value = "삭제" onclick= "deleteProduct()"></td></tr>
</table>

</body>
</html>