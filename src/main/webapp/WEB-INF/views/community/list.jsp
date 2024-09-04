<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글-목록</title>
<link rel="stylesheet" href="../resources/css/table.css">
</head>
<body>
	<h2>글-목록</h2>
	
	<table>
		<tr>
			<td>번호</td>
			<td>글제목</td>
			<td>작성자</td>
			<td>조회수</td>
			<td>날짜</td>
		</tr>
		<!-- 컨트롤러에서 페이지 글목록을 list라는 이름으로 저장해야함. -->
		<c:forEach items="${list}" var="dto">
			<tr>
				<td><c:out value="${dto.rnum}"/></td>
				<td><c:out value="${dto.title}"/></td>
				<td><c:out value="${dto.writer}"/></td>
				<td><c:out value="${dto.viewcount}"/></td>
				<td><c:out value="${dto.createAt}"/></td>
			</tr>
		</c:forEach>
		
	</table>
	<p>현재 페이지 정보 : <c:out value="${pageDto}"/></p><br>
	
	<br><hr><br>
	
	<h2>글 쓰기</h2>
		<a href="write?page=1">글 쓰기</a><br>
	<h2>상세보기</h2>
		<a href="read?idx=6&page=3">상세보기</a><br>
	<h2>글 수정</h2>
		<a href="modify?idx=4&page=2">글 수정</a><br>
	<h2>글 삭제</h2>
		<a href="remove?idx=7&page=5">글 삭제</a><br>
</body>
</html>