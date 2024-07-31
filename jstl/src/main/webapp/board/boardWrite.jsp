<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="/write.do" enctype="multipart/form-data">
	<input type="hidden" name="method" value="write">
	<div id="writeBox">
		<div class="writeInput">
			<label>제목</label>
			<input type="text" name="title" id="title">
		</div>
		<div class="writeInput">
			<label>이미지</label>
			<input type="file" name="boardImg" id="boardImg" accept=".jpg, .png, .jpeg, .gif"> <!-- accept="image/*" accept="video/*" -->
		</div>
		<div class="writeInput">
			<label>내용</label>
			<textarea name="content" id="content"></textarea>
		</div>
		<button>작성</button>
	</div>
	</form>

</body>
</html>