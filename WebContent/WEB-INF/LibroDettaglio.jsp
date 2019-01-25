<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dettaglio libro</title>
</head>
<body>
	<h1>Titolo: ${libro.getTitolo() }</h1>
	<h3>Descrizione: ${libro.getDescrizione() } </h3>
	<h3>
		Autore:<a
			href="${pageContext.request.contextPath}/AutoreDettaglioServlet?id=${libro.getAutoreId()}">
			${autore.getNome() } ${autore.getCognome() } </a>
	</h3>
	<!-- TODO add autore, add recensione, add genere -->

	<a
		href="${pageContext.request.contextPath}/LibroCancellazioneServlet?id=${id}">
		Cancella </a>
	<a href="#">Modifica</a>
</body>
</html>