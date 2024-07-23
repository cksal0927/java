<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- lunchInput.jsp -->
	<h2>오늘의 점심 메뉴</h2>
	<form method="post" action="choice.jsp">
		메뉴 : <input type="text" name="menu"> <br>
		가격 : <input type="number" name="price"> <br>
		식당 이름 : <input type="text" name="restaurant"> <br><br>
		<button>저장</button>
	</form>

</body>
</html>