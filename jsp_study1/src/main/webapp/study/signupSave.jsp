<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>

<%-- signupSave.jsp --%>

<%-- 회원가입을 위해 입력 값을 Member 클래스 객체로 저장하고 객체의 데이터를 데이터베이스에 저장 --%>

<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="newMem" class="study.Member" />
<jsp:setProperty property="*" name="newMem" />

<%
	// newMem 객체의 데이터를 데이터베이스에 저장
	// 1. 데이터베이스 드라이버 로드
	// 2. 데이터베이스 계정 접속
	
	try{  // 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e){
		System.out.println("드라이버 로드 실패");
	}

	// 계정 접속
	String user = "chanmi";
	String password = "123456";
	String url = "jdbc:mysql://localhost:3306/chanmi";
	
	Connection conn = null;
	PreparedStatement pt = null;
	try{ 
		conn = DriverManager.getConnection(url, user, password);
	}catch(SQLException e){
		System.out.println("접속 실패 : ");
	}
	
	// member테이블에 회원가입 입력한 값 저장하기
	// 테이블에 저장하기
	// 1. sql쿼리문 작성하기
	// 2. PreparedStatement 또는 Statement 객체 생성
	// 3. PreparedStatement 또는 Statement 객체를 사용하여 쿼리문 전달하기
	
	String sql = "insert_into_member(user_id, user_password, user_email, user_name) value(?,?,?,?)";
	
	boolean isSuccess = true;  // 테이블 저장 성공? true면 성공
	
	try{
		pt = conn.prepareStatement(sql);  // PreparedStatement 객체 생성
		pt.setString(1, newMem.getUserId());  // 첫 번째 물음표 자리에 데이터 넣기
		pt.setString(2, newMem.getUserPassword());
		pt.setString(3, newMem.getUserEmail());
		pt.setString(4, newMem.getUserName());
		pt.executeUpdate();  // insert, update, delete문 사용시 executeUpdate()
	}catch(SQLException e){
		isSuccess = false;
		e.printStackTrace();
		System.out.println("member 테이블 저장 실패");
		out.println("<h1>회원가입 오류! 다시 입력!</h1> <a href='javascript:history.back();'>이전</a>");
		// 테이블 저장 실패시 회원가입 페이지로 이동
		// response.sendRedirect("//study/?part=signup");
	}
	
	// 테이블 저장 성공시 로그인 페이지로 이동
	if(isSuccess){
		response.sendRedirect("//study/?part=signin");
	}
%>