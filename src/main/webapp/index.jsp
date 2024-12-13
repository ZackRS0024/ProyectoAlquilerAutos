<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Iniciar sesión</h1>
   <form action="Login" method="post">
         <label for="correo">Correo:</label><br>
         <input type="email" id="correo" name="txtCorreo" required><br>
         <label for="">Contraseña:</label><br>
         <input type="password" id="clave" name="txtClave" required><br><br>
         <button type="submit">Ingresar</button><br><br>
    </form>
</body>
</html>