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
		<span>글 제목 : </span><input type="text" name="title"><br>
		<p>내용 입력</p>
		<textarea rows="10" cols="20" name="content"></textarea><br>
		<button type="submit">저장</button>
	</form>
	<br>

</body>
</html>