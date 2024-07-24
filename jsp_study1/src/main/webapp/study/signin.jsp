<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- signin.jsp --%>

<div id="signinBox">

	<form method="post" action="signcheck.jsp">
		<div class="loginInput">
			<b>아이디</b>
			<input type="text" name="userId">
		</div>
		<div class="loginInput">
			<b>비밀번호</b>
			<input type="password" name="userPassword">
		</div>
		<button id="loginBt">로그인</button>
	</form>
	
	<p><a href="findUser.jsp">아이디/비밀번호 찾기</a></p>
	<p><a href="//study/?part=signup">회원가입</a></p>

</div>

<%--
	아래 내용으로 로그인 페이지 만들기

	전송방식: post
	전송 url : signCheck.jsp
	아이디 파라미터 : userId
	비밀번호 파라미터 : userPassword
	아이디/비밀번호 찾기 url : findUser.jsp
	회원가입 url : signup.jsp
--%>