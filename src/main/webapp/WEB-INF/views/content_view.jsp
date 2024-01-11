<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 글 내용 보기</title>
</head>
<body>
	<h2>자유게시판 글 내용 보기</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="600">
		<tr>
			<th width="100">번 호</th>
			<td>${fboardDto.fbnum }</td>
		</tr>
		<tr>
			<th>제 목</th>
			<td>${fboardDto.fbtitle }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${fboardDto.fbname }</td>
		</tr>
		<tr>
			<th height="100" valign="top">내 용</th>
			<td valign="top">${fboardDto.fbcontent }</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${fboardDto.fbhit }</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${fboardDto.fbdate }</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="button" value="수 정" onclick="javascript:window.location.href='modify_form?fbnum=${fboardDto.fbnum}'">
				<input type="button" value="삭 제" onclick="javascript:window.location.href='delete?fbnum=${fboardDto.fbnum}'">
				<input type="button" value="글목록" onclick="javascript:window.location.href='list'">
			</td>
		</tr>
	</table>
</body>
</html>