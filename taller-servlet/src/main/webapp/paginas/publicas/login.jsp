<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login del sistema</title>
<style type="text/css">
	#parent {
		display: table;
		width: 100%
	}
	
	#form_login {
		display: table-cell;
		text-align: center;
		vertical-align: middle;
	}

</style>

</head>
<body>
	<div style="text-align: center;">
		<h1>Ingreso al sistema del curso de java</h1>
	</div>
	
	
	<div id="parent">
		<form id="form_login" name="login" action="<%=request.getContextPath()%>/login.do" 
		method="post">
			<label for="inputUsuario">Usuario:</label>
			<input id="inputUsuario" name="usuario" placeholder="Ingrese el usuario" 
			type="text"/>
			<label for="inputPassword">Clave:</label>
			<input id="inputPassword" name="clave" placeholder="Ingrese la clave" 
			type="password"/>
			<input type="submit" value="Ingresar" id="button-1"/>
		</form>
	</div>
	
</body>
</html>