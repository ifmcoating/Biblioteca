<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<form method="post" action="loginServlet.do">
		Nome:<br> <input type="text" name="nome"> <br>
		Senha:<br> <input type="password" name="senha"> <br>
		<br> <input type="submit" value="ENVIAR" name="enviar">
	</form>


</body>
</html>