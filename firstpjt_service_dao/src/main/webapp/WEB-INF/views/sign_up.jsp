<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form 
		action="/firstpjt/signUpConfirm"
		method="post">
		
		ID: <input type="text" name="m_Id"><br>
		PW: <input type="password" name="m_Pw"><br>
		MAIL: <input type="email" name="m_Mail"><br>
		PHONE: <input type="text" name="m_Phone"><br>
		AGE: <input type="number" name="m_Age"><br>
		<input type="submit" value="SIGN UP">
		<input type="reset" value="RESET">
		
	</form>

</body>
</html>