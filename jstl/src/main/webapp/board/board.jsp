<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- jquery CDN -->
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

</head>
<body>

	<div id="boardWrap">
	<h2>게시판</h2>
	<div id="boardBox">
		<div id="boardListBox">
			<tr>
				<th class="num">번호</th>
				<th class="title">제목</th>
				<th class="writer">작성자</th>
				<th class="hit">조회수</th>
			</tr>
			<tr>
				<td class="num"></td>
				<td class="title"><a href="?part=view&id="></a></td>
				<td class="writer"></td>
				<td class="hit"></td>
			</tr>
			</div>
			<div id="boardSearchBox">
				<form method="get" action="?part=board">
					<div class="boardSearch">
						<input type="search" name="word" id="word">
						<button>검색</button>
					</div>
				</form>
			</div>
			<div id="boardWriteBox">
				<a id="wrBt">글 작성</a>
			</div>
		</div>
	</div>

	<script>
		$("#wrBt").on("click", function(){  // 글 작성을 클릭하면
			if('${sessionScope.user}' != ''){
				location.href = "/write.do";
			}else{
				var isOk = confirm("글 작성 권한이 없습니다. 로그인 하시겠습니까?");
				is(isOk){  // 로그인하겠다고 확인 버튼을 클릭했으므로 로그인 페이지 이동
					location.href = "/signIn.do";
				}
			}
		});
	</script>

</body>
</html>