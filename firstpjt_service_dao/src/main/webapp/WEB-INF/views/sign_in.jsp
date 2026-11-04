<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>

	<%-- 로그인 폼: 아이디·비밀번호를 /first/signInConfirm 으로 POST 전송한다. --%>
	<form 
		action="/first/signInConfirm" 
		method="post">
		
		ID : <input type="text" name="m_id"><br>
		PW : <input type="password" name="m_pw"><br>
		<input type="submit" value="SIGN IN">
		<input type="reset" value="RESET">
	</form>

</body>
</html>