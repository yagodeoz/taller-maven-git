<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error de la aplicacion</title>
</head>
<body>

<h1 style="text-align: center;">Mensaje de error</h1>

<div style="text-align: center; color: red">
	Mensaje del servidor: <%=request.getAttribute("mensaje")%> 
</div>


</body>
</html>