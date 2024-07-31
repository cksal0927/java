<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>로그인 화면</h2>
	<div id="signinBox">
		<form id="signFm" method="post" action="/signInCheck.do">
			<div class="signinInput">
				<div class="loginInput">
					<b>아이디</b>
					<input type="text" name="userId" id="userId">
					<p class="error"></p>
				</div>
			
				<div class="loginInput">
					<b>비밀번호</b>
					<input type="password" name="userPassword" id="userPassword">
					<p class="error"></p>
				</div>
			<button type="button" id="loginBt">로그인</button>
			</div>
		</form>
		<div class="findAndJoin">
			<p><a href="findUser.jsp">아이디/비밀번호 찾기</a></p>
			<p><a href="//study/?part=signup">회원가입</a></p>
		</div>
	</div>

</body>
</html>