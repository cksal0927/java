<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- header.jsp --%>

<%
	String select = request.getParameter("select");
%>

<div id="header">
	<ul id="menuList">
		<li class="menu"><a href="mainPage.jsp">HOME</a></li>
		<li class="menu">소개</li>
		<li class="menu">자유게시판</li>
		<li class="menu"><%=select.equals("imageBoard") ? "active" : "" %><a href="imageBoard.jsp?part=imageBoard">이미지게시판</a></li>
		<li class="menu"><a href="mainPage.jsp/part="report">신고</a></li>
	</ul>
</div>