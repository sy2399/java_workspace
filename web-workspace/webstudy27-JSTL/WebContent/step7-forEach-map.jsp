<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.*"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>step7-forEach-map.jsp</title>
</head>
<body>
<%
	LinkedHashMap<String, MemberVO> map = new LinkedHashMap<String,MemberVO>();
	MemberVO vo1 = new MemberVO("java","123","김문일","판교");
	MemberVO vo2 = new MemberVO("spring","abcd","김호겸","야탑");
	MemberVO vo3 = new MemberVO("mybatis","aaaa","김규익","동대문");
	map.put(vo1.getId(), vo1);
	map.put(vo2.getId(), vo2);
	map.put(vo3.getId(), vo3);
	
	session.setAttribute("memMap", map);

%>

1. scriptlet으로 key,value(name.address)를 출력<br>
<%
	@SuppressWarnings("unchecked")
	LinkedHashMap<String, MemberVO> memMap = (LinkedHashMap<String, MemberVO>)session.getAttribute("memMap");
		Iterator keyData = memMap.keySet().iterator();
		String k;
		MemberVO vo;
		while (keyData.hasNext()) {
		        k = (String) keyData.next();
		        vo = memMap.get(k);%>
		        key:<%=k %> value : <%=vo.getName() %> <%=vo.getAddress() %><br>
		    
		<%} // while
%>
<hr>
2. JSTL forEach 로 map의 key,value(name.address)를 출력<br>
<c:forEach items = "${sessionScope.memMap}" var = "m"> 
	key : ${m.key } value : ${m.value.name } ${m.value.address } <br>
</c:forEach>

</body>
</html>