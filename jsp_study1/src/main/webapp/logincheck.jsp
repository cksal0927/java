<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String myId = request.getParameter("id");
	String myPw = request.getParameter("pw");
	
	out.println(myId);
	
	if(myId.equals("cksal0927") && myPw.equals("1234")){
%>
	
	<script>
		alert("로그인 성공");
		location.href="login.jsp"
	</script>
	
<%		
	}
%>
    
<%-- jsp 주석 --%>

<!-- logincheck.jsp -->