<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Libro inserito con successo</title>
</head>
<body>
	<h1>Libro ${libro.getTitolo()} inserito con successo :)</h1>
	<br>
	<p>${libro.getDescrizione() }</p>
	<a href="${pageContext.request.contextPath}/LibroServlet">Torna
		alla lista dei libri</a>
	<br>
	<a href="${pageContext.request.contextPath}/LibroFormServlet">Crea
		un nuovo libro</a>
</body>
</html>