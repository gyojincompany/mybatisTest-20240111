<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String idcheck = request.getAttribute("idFlag").toString();
		//컨트롤러에서 model객체에 넣어서 보내준 값을 빼는 방법
		if(idcheck.equals("1")) { //가입가능 아이디
	%>
		<script type="text/javascript">
			alert('입력하신 아이디는 사용 가능한 아이디입니다.');
			history.go(-1);
		</script>
	<%
		} else {
	%>	
		<script type="text/javascript">
			alert('입력하신 아이디는 이미 사용중인 아이디입니다. 다른 아이를 입력해주세요.');
			history.go(-1);
		</script>
	<%
		}
	%>		
</body>
</html>