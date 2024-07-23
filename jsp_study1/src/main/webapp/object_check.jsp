<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- object_check.jsp --%>

<h2>객체 적용 범위 확인</h2>

request객체 -> name : <%=request.getAttribute("name") %> <br>
session객체 -> age : <%=session.getAttribute("age") %> <br>
application객체 -> job : <%=application.getAttribute("job") %>