<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글-쓰기</title>
</head>
<body>
	<h2>글을 씁시다?</h2>
	<form action="write" method="post">
		<input type="text" name="content"><br>
		<button type="submit">저장</button>
	</form>
	<br>
			<h2>글 수정</h2>
		<a href="modify?page=2">글 수정</a><br>
</body>
</html>