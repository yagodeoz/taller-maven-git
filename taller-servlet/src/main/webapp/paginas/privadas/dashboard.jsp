<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align: center;"> Bienvenido </h1>

Usuario: <%=request.getAttribute("usuario")%>

<form action="<%=request.getContextPath()%>/paginas/privadas/fecha.do" method="post">
	<input type="submit" value="Obtener Fecha" id="button-1"/>
</form>

</body>
</html>