<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- choice.jsp --%>

<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="lunch" class="test.Lunch" />
<jsp:setProperty name="lunch" property="menu" />
<jsp:setProperty name="lunch" property="price" />
<jsp:setProperty name="lunch" property="restaurant" />

<jsp:getProperty name="lunch" property="menu" />
<jsp:getProperty name="lunch" property="price" />
<jsp:getProperty name="lunch" property="restaurant" />