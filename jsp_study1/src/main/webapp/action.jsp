<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- action.jsp --%>

<%--
	action 태그 : 서버나 클라이언트에게 동작을 명령하는 태그
	xml형식의 태그 사용법
	자바반의 기능 사용
	
	종류
	<jsp:forward />  다른 페이지로 이동 (주소 변경 없이)
	<jsp:include />  외부 페이지의 내용 포함
	<jsp:plugin />  웹 브라우저에서 자바 애플릿 실행
	<jsp.useBean />  jsp페이지에 자바빈즈 설정 (자바 클래스 객체)
	<jsp.setProperty />  자바빈즈의 프로펄티 값 설정 (클래스의 인스턴스 변수 값 설정)
	<jsp.getProperty />  자바빈즈의 프로펄티 값 가져오기 (클래스의 인스턴스 변수 값 가져오기)
	<jsp.param />  forward, include의 인자 추가 (메서드의 매개변수에 값 저장하는 것과 같음)
--%>

<%--
	useBean
		id : 클래스 객체의 주소를 저장할 참조 변수
			 Music music = new Music();
		class : 클래스의 경로 (패키지명 포함)
		scope : 자바빈 객체가 저장될 영역 설정 (내장객체 중 하나)
				page, request, session, application
				
	setProperty - 자바빈 객체에 인스턴스 변수에 값 저장
		Music.setTitle("비가오는날엔");
		name : 객체 이름 (객체 주소가 저장된 참조변수)
		property : 인스턴스 변수 이름 (set변수명 메서드 호출이 된다)
		value : 저장할 데이터
--%>

<%
	request.setCharacterEncoding("utf-8");

//	String title = request.getParameter("title");
//	out.println(title);
//	String singer = request.getParameter("singer");
	
//	Music m= new Music();
//	m.setTitle(title);
%>

<jsp:useBean id="music" class="test.Music" />
<jsp:setProperty name="music" property="title" />
<jsp:setProperty name="music" property="singer" />
<jsp:setProperty name="music" property="year" />

<jsp:getProperty name="music" property="title" />

<%
	out.println(music.getSinger());
%>

<%=music.getYear() %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>