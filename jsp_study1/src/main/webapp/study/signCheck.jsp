<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String myId = request.getParameter("userId");
	String myPw = request.getParameter("userPassword");
	
	out.println(myId);
	
	if(myId.equals("cksal0927") && myPw.equals("1234")){
%>
	
	<script>
		alert("로그인 성공");
		location.href="signin.jsp"
	</script>
	
<%		
	}
%>