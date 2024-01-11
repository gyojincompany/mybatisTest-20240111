<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	<%
		String sid = (String) session.getAttribute("sessionId");
		if(sid == null) {
	%>
		<script type="text/javascript">
			alert('입력하신 아이디 또는 비밀번호가 잘못되었습니다. 다시 확인해 주세요.');
			history.go(-1);
		</script>
	<%		
			
		}
	
	%>	
	<h2>로그인 성공</h2>
	<hr>
	<a href="list">게시판 바로가기</a><br><br>
	<a href="logout">로그아웃</a>
	
	
</body>
</html>