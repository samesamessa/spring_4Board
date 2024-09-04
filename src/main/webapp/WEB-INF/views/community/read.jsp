<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세상세상세상세보기페이지입니다</title>
<link rel="stylesheet" href="../resources/css/table.css">
</head>
<body>
	<h2>상세상세상세상세하게봅니다</h2>
	<hr>
	목록으로 돌아가기 : &emsp; <a href="list?page=${page}">목록</a>
	<br><br>
	<table>
		<tr>
			<td>번호</td>
			<td>글제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>날짜</td>
		</tr>
		<tr>
			<td><c:out value="${dto.idx}"/></td>
			<td><c:out value="${dto.title}"/></td>
			<td><c:out value="${dto.writer}"/></td>
			<td><c:out value="${dto.viewcount}"/></td>
			<td><c:out value="${dto.createAt}"/></td>
		</tr>
		<tr>
			<td colspan="5"><c:out value="${dto.content}"/></td>
		</tr>
	</table>

</body>
</html>