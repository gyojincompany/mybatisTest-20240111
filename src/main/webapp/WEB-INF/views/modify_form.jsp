<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판 글수정</title>
</head>
<body>
	<h2>자유게시판 글수정</h2>
	<hr>
	<table border="1" cellspacing="0" cellpadding="0" width="600">
		<form action="modify">
		<!-- 
		<tr>
			<td>번 호</td>
			<td><input type="text" name="fbnum" size="60" value="${fboardDto.fbnum }" readonly="readonly"></td>
		</tr>
		 -->
		<input type="hidden" name="fbnum" size="60" value="${fboardDto.fbnum }">
		<tr>
			<td>제 목</td>
			<td><input type="text" name="fbtitle" size="60" value="${fboardDto.fbtitle }"></td>
		</tr>
		<tr>
			<td>이 름</td>
			<td><input type="text" name="fbname" size="60" value="${fboardDto.fbname }"></td>
		</tr>
		<tr>
			<td>내 용</td>
			<td>
				<textarea rows="10" cols="50" name="fbcontent">${fboardDto.fbcontent }</textarea>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="수정완료">&nbsp;&nbsp;
				<input type="button" value="수정취소" onclick="javascript:window.location.href='list'">
			</td>
		</tr>
		</form>
	</table>
</body>
</html>