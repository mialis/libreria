<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Libro</title>
</head>
<body>
	<h1>Inserisci un Nuovo Libro</h1>
	<form action="${pageContext.request.contextPath}/LibroFormServlet"
		method="POST">
		<p>Titolo</p>
		<input type="text" name="titolo"> <br>
		<p>Descrizione</p>
		<input type="text" name="descrizione"> <br>
		<p>Autore_id</p>
		<input type="number" name="autore_id">
		<input type="submit" value="crea">
		</form>
</body>
</html>