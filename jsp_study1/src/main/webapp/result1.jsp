<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- result1.jsp --%>
<%-- 
	이름과 국어, 수학, 성적을 받아서 이름을 출력하고
	평균이 90점 이상이면 "참 잘했어요"
	80점 이상이면 "잘했어요"
	70점 이상이면 "더 노력하세요"
	그 이하는 "이게 점수야!!" 출력하기
--%>

<%
	String 이름 = request.getParameter("name");
	int 국어 = Integer.parseInt(request.getParameter("kor"));
	int 수학 = Integer.parseInt(request.getParameter("mat"));
	int 과학 = Integer.parseInt(request.getParameter("sci"));
	int 평균 = (국어 + 수학 + 과학)/3;
	
	String print = "이름 : " + 이름;
	
	if(평균>=90)
		print += " 참 잘했어요";
	else if(평균>=80)
		print += " 잘했어요";
	else if(평균>=70)
		print += " 더 노력하세요";
	else
		print += " 이게 점수야!!";
%>

<%= print %>

<br><br>

<hr>
<%@ include file="requestTest2.jsp" %>
