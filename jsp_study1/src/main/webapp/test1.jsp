<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, java.util.LinkedList, java.util.Date"
    session="true" errorPage="error500.jsp" buffer="1kb" autoFlush="false" %>
    
<%-- test1.jsp --%>

<%--
	<%@ - JSP 지시어 스크립트 작성 부분
	지시어 - 해당 jsp 페이지의 설정을 하기 위한 부분
	page - jsp 페이지의 속성을 지정하는 역할
		   language : 페이지 사용할 언어셋 설정
		   contentType : 페이지의 문서 타입 지정
		   pageEncoding : 현재 페이지의 인코딩 타입 지정
		   import : 다른 패키지의 클래스나 메서드 추가
		   session : 세션 사용 여부를 지정
		   isErrorPage : true일 경우 현재 페이지를 에러 페이지로 지정
		   errorPage : 현재 페이지에 에러 발생시 사용될 페이지 지정
		   			   클라이언트 브라우저에는 서버 언어(JAVA)가 노출되면 안 된다.
		   info : 페이지의 설명
		   extends : 현재 페이지에 상속 받을 클래스 지정
		   buffer : jsp 페이지의 출력 버퍼값 지정 (기본 8kb)
		   autoFlush : 출력버퍼가 초과되면 수행할 기능 지정
		   			   true일 경우 버퍼가 100%이면 내용을 화면에 출력
		   			   false일 경우 IOException 발생
		   			   예외 처리에서 throw를 하는 이유와 같이 기록(log)을 남겨두기 위해 false로 사용하기도 한다.
		   
	include - 다른 jsp 페이지 추가 (현재 페이지에 내용을 포함)
	taglib	- 태그 라이브러리 태그를 사용할 경우에 사용
	

	JSP 주석 - 사용자 브라우저에서는 확인되지 않는다.
			  서버 컴퓨터에서만 동작하는 부분이기 때문에 사용자에게 노출되지 않는다.
			  
	웹 흐름
	서버 컴퓨터 - 서비스를 제공하는 컴퓨터
	클라이언트가 주소에 의한 요청을 하면 서버 컴퓨터는 요청에 대한 응답을 한다.
	페이지를 보기 위해 해당 페이지에 대한 주소를 요청하면
	서버는 해당 페이지를 찾아서 페이지 내부의 서버 언어(JAVA)를 실행시키고
	클라이언트 언어(HTML, CSS, JS) 부분을 클라이언트에게 전송한다.
	클라이언트는 서버로부터 받은 내용을 브라우저가 실행하여 화면에 출력한다.
--%>

<%
	// include 동작 전
	String name = "이순신";
	out.println(name);
%>
    
<%@ include file="menu.jsp" %>

<%
	// int num = 10/0;
	out.println("테스트");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>