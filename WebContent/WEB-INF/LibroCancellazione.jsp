<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ${libro.getTitolo() } Cancellato! :) </h1>

<a href="${pageContext.request.contextPath}/LibroServlet">Torna
		alla lista dei libri</a>
	<br>
	<a href="${pageContext.request.contextPath}/LibroFormServlet">Crea
		un nuovo libro</a>

</body>
</html>