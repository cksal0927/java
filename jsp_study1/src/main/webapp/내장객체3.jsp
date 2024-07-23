<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 내장객체3.jsp --%>

<pre>
안뇽
모해
배고파
</pre>
<%
	out.print("출력");
	out.newLine();
	out.println("정수, 실수, 문자, 문자열 출력 가능");
	
	// page == this
	String name = "이순신";
	pageContext.getRequest().getParameter(name);
	pageContext.setAttribute("age", 25);
	
	// pageContext.include("requestTest2.jsp");  // <%@ include file="경로"
	pageContext.forward("test3.jsp");
%>

<jsp:include page="파일명" />
<jsp:forward page="파일명" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	

</body>
</html>